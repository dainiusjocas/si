---
aliases: [nuostatai-2020]
projects: [sekmes-inkilelis]
title: Paraiška
# authors: [Dainius Jocas]
date: '2020-02-05'
tags: []
categories:
  - Kandidatuok
summary: Paraiškos dėl kandidatavimo į paramą forma
image:
  caption: "[Photo by nexmo.com](https://www.nexmo.com/blog/2016/05/31/building-sms-google-sheets-application-aws-lambda-dr)"
  focal_point: "Center"
  placement: 1
  preview_only: false
output:
  blogdown::html_page:
    toc: true
    number_sections: true
    toc_depth: 1
---
<!-- 
<form id="fs-frm" name="survey-form" accept-charset="utf-8" method="post" data-netlify-recaptcha="true" netlify>
  <fieldset id="fs-frm-inputs">
    <label for="full-name">Vardas, Pavardė:</label>
    <input type="text" name="name" id="full-name" placeholder="Vardenis Pavardenis" required="true">
    <label for="amzius">Amžius:</label>
    <select name="amzius" id="amzius" required="true">
      <option value="Choose" selected="" disabled="">Pasirinkti</option>
      <option value="iki-14">Iki 14</option>
      <option value="nuo-14-iki-29">Nuo 14 iki 29</option>
    </select>
    <label for="statusas">Statusas</label>
    <select name="statusas" id="statusas" required="true">
      <option value="Choose" selected="" disabled="">Pasirinkti</option>
      <option value="moksleivis">Moksleivis</option>
      <option value="studentas">Studentas</option>
      <option value="kita">Kita</option>
    </select>
    <label for="savivaldybe">Savivaldybė, kurioje yra registruota gyvenamoji vieta:</label>
    <select name="savivaldybe" id="savivaldybe" required="true">
      <option value="Choose" selected="" disabled="">Pasirinkti</option>
      <option value="akmenės_rajono_savivaldybė">Akmenės rajono savivaldybė</option>
      <option value="alytaus_miesto_savivaldybė">Alytaus miesto savivaldybė</option>
      <option value="alytaus_rajono_savivaldybė">Alytaus rajono savivaldybė</option>
      <option value="anykščių_rajono_savivaldybė">Anykščių rajono savivaldybė</option>
      <option value="birštono_savivaldybė">Birštono savivaldybė</option>
      <option value="biržų_rajono_savivaldybė">Biržų rajono savivaldybė</option>
      <option value="druskininkų_savivaldybė">Druskininkų savivaldybė</option>
      <option value="elektrėnų_savivaldybė">Elektrėnų savivaldybė</option>
      <option value="ignalinos_rajono_savivaldybė">Ignalinos rajono savivaldybė</option>
      <option value="jonavos_rajono_savivaldybė">Jonavos rajono savivaldybė</option>
      <option value="joniškio_rajono_savivaldybė">Joniškio rajono savivaldybė</option>
      <option value="jurbarko_rajono_savivaldybė">Jurbarko rajono savivaldybė</option>
      <option value="kaišiadorių_rajono_savivaldybė">Kaišiadorių rajono savivaldybė</option>
      <option value="kalvarijos_savivaldybė">Kalvarijos savivaldybė</option>
      <option value="kauno_miesto_savivaldybė">Kauno miesto savivaldybė</option>
      <option value="kauno_rajono_savivaldybė">Kauno rajono savivaldybė</option>
      <option value="kazlų_rūdos_savivaldybė">Kazlų Rūdos savivaldybė</option>
      <option value="kėdainių_rajono_savivaldybė">Kėdainių rajono savivaldybė</option>
      <option value="kelmės_rajono_savivaldybė">Kelmės rajono savivaldybė</option>
      <option value="klaipėdos_miesto_savivaldybė">Klaipėdos miesto savivaldybė</option>
      <option value="klaipėdos_rajono_savivaldybė">Klaipėdos rajono savivaldybė</option>
      <option value="kretingos_rajono_savivaldybė">Kretingos rajono savivaldybė</option>
      <option value="kupiškio_rajono_savivaldybė">Kupiškio rajono savivaldybė</option>
      <option value="lazdijų_rajono_savivaldybė">Lazdijų rajono savivaldybė</option>
      <option value="marijampolės_savivaldybė">Marijampolės savivaldybė</option>
      <option value="mažeikių_rajono_savivaldybė">Mažeikių rajono savivaldybė</option>
      <option value="molėtų_rajono_savivaldybė">Molėtų rajono savivaldybė</option>
      <option value="neringos_savivaldybė">Neringos savivaldybė</option>
      <option value="pagėgių_savivaldybė">Pagėgių savivaldybė</option>
      <option value="pakruojo_rajono_savivaldybė">Pakruojo rajono savivaldybė</option>
      <option value="palangos_miesto_savivaldybė">Palangos miesto savivaldybė</option>
      <option value="panevėžio_miesto_savivaldybė">Panevėžio miesto savivaldybė</option>
      <option value="panevėžio_rajono_savivaldybė">Panevėžio rajono savivaldybė</option>
      <option value="pasvalio_rajono_savivaldybė">Pasvalio rajono savivaldybė</option>
      <option value="plungės_rajono_savivaldybė">Plungės rajono savivaldybė</option>
      <option value="prienų_rajono_savivaldybė">Prienų rajono savivaldybė</option>
      <option value="radviliškio_rajono_savivaldybė">Radviliškio rajono savivaldybė</option>
      <option value="raseinių_rajono_savivaldybė">Raseinių rajono savivaldybė</option>
      <option value="rietavo_savivaldybė">Rietavo savivaldybė</option>
      <option value="rokiškio_rajono_savivaldybė">Rokiškio rajono savivaldybė</option>
      <option value="skuodo_rajono_savivaldybė">Skuodo rajono savivaldybė</option>
      <option value="šakių_rajono_savivaldybė">Šakių rajono savivaldybė</option>
      <option value="šalčininkų_rajono_savivaldybė">Šalčininkų rajono savivaldybė</option>
      <option value="šiaulių_miesto_savivaldybė">Šiaulių miesto savivaldybė</option>
      <option value="šiaulių_rajono_savivaldybė">Šiaulių rajono savivaldybė</option>
      <option value="šilalės_rajono_savivaldybė">Šilalės rajono savivaldybė</option>
      <option value="šilutės_rajono_savivaldybė">Šilutės rajono savivaldybė</option>
      <option value="širvintų_rajono_savivaldybė">Širvintų rajono savivaldybė</option>
      <option value="švenčionių_rajono_savivaldybė">Švenčionių rajono savivaldybė</option>
      <option value="tauragės_rajono_savivaldybė">Tauragės rajono savivaldybė</option>
      <option value="telšių_rajono_savivaldybė">Telšių rajono savivaldybė</option>
      <option value="trakų_rajono_savivaldybė">Trakų rajono savivaldybė</option>
      <option value="ukmergės_rajono_savivaldybė">Ukmergės rajono savivaldybė</option>
      <option value="utenos_rajono_savivaldybė">Utenos rajono savivaldybė</option>
      <option value="varėnos_rajono_savivaldybė">Varėnos rajono savivaldybė</option>
      <option value="vilkaviškio_rajono_savivaldybė">Vilkaviškio rajono savivaldybė</option>
      <option value="vilniaus_miesto_savivaldybė">Vilniaus miesto savivaldybė</option>
      <option value="vilniaus_rajono_savivaldybė">Vilniaus rajono savivaldybė</option>
      <option value="visagino_savivaldybė">Visagino savivaldybė</option>
      <option value="zarasų_rajono_savivaldybė">Zarasų rajono savivaldybė</option>
    </select>
    <label for="email-address">Kontaktiniai duomenys (el. paštas, telefono numeris):</label>
    <input type="text" name="kontaktiniai-duomenys" id="kontaktiniai-duomenys" placeholder="+37060000000" required="true">
    <label for="veiklos-sritis">Veikos sritis, dėl kurios teikiama paraiška paramai gauti</label>
    <select name="veiklos-sritis" id="veiklos-sritis" required="true">
      <option value="Choose" selected="" disabled="">Pasirinkti</option>
      <option value="mokslas">Mokslas</option>
      <option value="inovacijos">Inovacijos</option>
      <option value="menas">Menas</option>
      <option value="sportas">Sportas</option>
      <option value="visuameniskumas">Visuomeniškumas</option>
      <option value="kita">Kita</option>
    </select>
    <label for="dalyvio-prisistatymas">Dalyvio prisistatymas:</label>
    <textarea rows="3" name="dalyvio-prisistatymas" id="dalyvio-prisistatymas" placeholder="Prisistatykite..." required="true"></textarea>
    <label for="veiklos-apibudinimas">Veiklos, dėl kurios yra teikiamas prašymas paramai gauti, apibūdinimas:</label>
    <textarea rows="3" name="veiklos-apibudinimas" id="veiklos-apibudinimas" placeholder="Apibūdinkite veiklą..." required="true"></textarea>
    <label for="kodel-reikalinga-parama">Apibūdinimas, kodėl pareiškėjui yra reikalinga parama:</label>
    <textarea rows="3" name="kodel-reikalinga-parama" id="kodel-reikalinga-parama" placeholder="Kodėl reikalinga parama..." required="true"></textarea>
    <label for="informacija-teisinga">
    <input type="checkbox" id="informacija-teisinga" name="informacija-teisinga" value="informacija-teisinga" />Patvirtinu, kad aukščiau pateikta informacija yra teisinga, man yra žinoma, kad pateikęs neteisingą informaciją neturėsiu galimybės dalyvauti šiame ir kituose Sėkmės inkilėlio projektuose:</label>
    <label for="susipazinau">
    <input type="checkbox" id="susipazinau" name="susipazinau" value="susipazinau" />Patvirtinu, kad man yra žinoma, jog Sėkmės inkilėlio projekto organizatoriai gali naudoti mano jiems pateiktus asmens duomenis Sėkmės inkilėlio projekto konkurso atrankos ir viešinimo tikslais.</label>
    <input type="file" id="dokumentai" name="dokumentai">
    <label for="veiklos-sritis">Dokumentai, patvirtinantys jaunuolio dalyvavimą veiklos srityje (pvz., pažyma iš švietimo įstaigos, rekomendacija)</label>
    <input type="hidden" name="_subject" id="email-subject" value="Sėkmės inkilėlio paraiška">
  </fieldset>

  <div data-netlify-recaptcha="true"></div>

  <input type="submit" value="Siųsti" />
</form>
<style>/* reset */
#fs-frm input,
#fs-frm select,
#fs-frm textarea,
#fs-frm fieldset,
#fs-frm optgroup,
#fs-frm label,
#fs-frm #card-element:disabled {
  font-family: inherit;
  font-size: 100%;
  color: inherit;
  border: none;
  border-radius: 0;
  display: block;
  width: 100%;
  padding: 0;
  margin: 0;
  -webkit-appearance: none;
  -moz-appearance: none;
}
#fs-frm label,
#fs-frm legend,
#fs-frm ::placeholder {
  font-size: .825em;
  margin-bottom: .5em;
  padding-top: .2em;
  display: flex;
  align-items: baseline;
}
/* border, padding, margin, width */
#fs-frm input,
#fs-frm select,
#fs-frm textarea,
#fs-frm #card-element {
  border: 1px solid rgba(0,0,0,0.2);
  background-color: rgba(255,255,255,0.9);
  padding: .75em 1em;
  margin-bottom: 1.5em;
}
#fs-frm input:focus,
#fs-frm select:focus,
#fs-frm textarea:focus {
  background-color: white;
  outline-style: solid;
  outline-width: thin;
  outline-color: gray;
  outline-offset: -1px;
}
#fs-frm [type="text"],
#fs-frm [type="email"] {
  width: 100%;
}
#fs-frm [type="button"],
#fs-frm [type="submit"],
#fs-frm [type="reset"] {
  width: auto;
  cursor: pointer;
  -webkit-appearance: button;
  -moz-appearance: button;
  appearance: button;
}
#fs-frm [type="button"]:focus,
#fs-frm [type="submit"]:focus,
#fs-frm [type="reset"]:focus {
  outline: none;
}
#fs-frm [type="submit"],
#fs-frm [type="reset"] {
  margin-bottom: 0;
}
#fs-frm select {
  text-transform: none;
}
<!-- #fs-frm [type="checkbox"] {
  -webkit-appearance: checkbox;
  -moz-appearance: checkbox;
  appearance: checkbox;
  display: inline-block;
  width: auto;
  margin: 0 .5em 0 0 !important;
} -->
#fs-frm [type="radio"] {
  -webkit-appearance: radio;
  -moz-appearance: radio;
  appearance: radio;
}
/* address, locale */
#fs-frm fieldset.locale input[name="city"],
#fs-frm fieldset.locale select[name="state"],
#fs-frm fieldset.locale input[name="postal-code"] {
  display: inline;
}
#fs-frm fieldset.locale input[name="city"] {
  width: 52%;
}
#fs-frm fieldset.locale select[name="state"],
#fs-frm fieldset.locale input[name="postal-code"] {
  width: 20%;
}
#fs-frm fieldset.locale input[name="city"],
#fs-frm fieldset.locale select[name="state"] {
  margin-right: 3%;
}
#fs-frm  label {
  font-weight: bolder;
}
</style>

{{% staticref "files/anketa.sekmes-inkilelis.2020-01-30.pdf" %}}Atsisiųskite paraišką `pdf` formatu{{% /staticref %}}

{{% staticref "files/anketa.sekmes-inkilelis.2020-01-30.docx" %}}Atsisiųskite paraišką `docx` formatu{{% /staticref %}} -->
