(ns mare
  (:require [clojure.string :as str]
            [clojure.java.io :as io]))

(defn to-line [cells]
  (str "|" (str/join "|" (map str/trim cells)) "|"))

(defn to-table [lines]
  (str/join "\n" lines))


(defn to-markdown-table [f]
  (->> (line-seq (io/reader f))
       (remove str/blank?)
       (partition-all 3)
       (map (fn [[nr place date]]
              (let [nr (str/replace nr "Nr. " "")
                    [nr owner] (str/split nr #" (savininkas|savininkė|savininkai|savininkės) ")
                    place (-> place
                              (str/replace "Vieta: " "")
                              (str/replace "." ""))
                    date (-> date
                             (str/replace "Pakabinta:" "")
                             (str/replace "." ""))]
                (to-line [nr (or owner "") place date]))))
       (to-table)))

(defn to-siauliai-2019-table [f]
  (->> (line-seq (io/reader f))
       (remove str/blank?)
       (partition-all 3)
       (map (fn [[nr place date]]
              (let [[nr owner] (str/split nr #" " 2)
                    place (-> place (str/replace "Vieta: " ""))
                    date (-> date
                             (str/replace "Pakabinta:" "")
                             (str/replace "." ""))]
                (to-line [nr (or owner "") place date]))))
       (to-table)))

(defn to-klaipeda-2017-table [f]
  (->> (line-seq (io/reader f))
       (remove str/blank?)
       (partition-all 3)
       (map (fn [[nr place date]]
              (let [[nr owner] (-> nr (str/replace "Nr. " "") (str/split #" " 2))
                    owner (str/replace (or owner "") #"(savininkas|savininkė|savininkai) " "")
                    place (-> place
                              (str/replace "Vieta: " "")
                              (str/replace #" \(kitoje Meridiano pusėje\)" "")
                              (str/replace "." ""))
                    date (-> date
                             (str/replace "Pakabinta:" "")
                             (str/replace "." ""))]
                (to-line [nr (or owner "") place date]))))
       (to-table)))

(defn to-vilnius-2014-table [f]
  (->> (line-seq (io/reader f))
       (remove str/blank?)
       (partition-all 3)
       (map (fn [[nr place date]]
              (let [nr (str/replace nr "Nr. " "")
                    [nr owner] (str/split nr #" (savininkas|savininkė|savininkai) ")
                    place (-> place
                              (str/replace "Vieta: " "")
                              (str/replace "." ""))
                    date (-> date
                             (str/replace "Pakabinta:" "")
                             (str/replace "." ""))]
                (to-line [nr (or owner "") place date]))))
       (reverse)
       (to-table)))

(comment
  (to-markdown-table "resources/marijampole-2016.txt")
  (to-markdown-table "resources/siauliai-2016.txt")
  (to-markdown-table "resources/siauliai-2019.txt")
  (to-siauliai-2019-table "resources/siauliai-2019.txt")
  (mare/to-klaipeda-2017-table "resources/klaipeda-2017.txt")
  (mare/to-markdown-table "resources/kaunas-2016.txt")
  (mare/to-siauliai-2019-table "resources/klaipeda-2019.txt")
  (mare/to-vilnius-2014-table "resources/vilnius-2014.txt")
  (mare/to-markdown-table "resources/vilnius-2017.txt")
  (mare/to-siauliai-2019-table "resources/vilnius-2018.txt"))
