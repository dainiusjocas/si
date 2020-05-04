---
aliases: [kaip-isigyti-privatiems]
projects: [sekmes-inkilelis]
title: Kaip įsigyti privatiems asmenims
# authors: ["Geležinis vilkas"]
date: '2020-04-19'
tags: []
categories:
  - Informacija
summary: Sėkmės inkilėlo rezervacija privatiems asmenims
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

gallery_item:
- album: inkileliai
  image: 00.jpg
  caption: Inkilėlis
- album: inkileliai
  image: 01.jpg
  caption: Inkilėlis
- album: inkileliai
  image: 02.jpg
  caption: Inkilėlis
- album: inkileliai
  image: 03.jpg
  caption: Inkilėlis
- album: inkileliai
  image: 05.jpg
  caption: Inkilėlis
- album: inkileliai
  image: 06.jpg
  caption: Inkilėlis
- album: inkileliai
  image: 07.jpg
  caption: Inkilėlis
---

<form id="fsr-frm" name="personal-reservation-form" accept-charset="utf-8" method="POST" data-netlify-recaptcha="true" netlify data-netlify="true" action="/informacija/rezervacija-privatiems">
  <fieldset id="fsr-frm-inputs-reservation">
    <label for="full-name">Pirkėjo vardas ir pavardė:</label>
    <input type="text" name="pirkejo-vardas" id="full-name" placeholder="Vardenis Pavardenis" required="true">
    <input type="checkbox" class="foo" id="pirkejas-kitas-asmuo" name="pirkejas-kitas-asmuo" value="pirkejas-kitas-asmuo"><b class="pka">Pirkėjas kitas asmuo?</b></input>
    <label class="savininkas" for="savininko-vardas-ir-pavarde">Inkilėlio savininko vardas ir pavardė:</label>
    <input class="savininkas" type="text" name="savininkas" id="savininko-vardas-ir-pavarde" placeholder="Vardenis Pavardenis">
    <label for="email-address">Elektroninis paštas:</label>
    <input type="email" name="kontaktiniai-duomenys" id="kontaktiniai-duomenys" placeholder="example@example.com" required="true">
    <label for="phone-number">Telefono numeris:</label>
    <input type="tel" name="phone-number" id="phone-number" placeholder="+37060000000" required="false">
    <label for="inkileliu-kiekis">Inkilėlių kiekis:</label>
    <input type="number" name="inkileliu-kiekis" id="inkileliu-kiekis" required="true" value="1" min="1" max="10"></input>
    <label for="skiriama-suma">Skiriama suma vienam inkilėliui:</label>
    <input type="number" name="skiriama-suma" id="skiriama-suma" value="30" min="30" max="100"></input>
    <input type="checkbox" class="foo" id="pristatyti" name="pristatyti" value="pristatyti"><b class="pka">Pristatyti nurodytu adresu? Nepažymėjus, inkilėlį pakabinsime Sapiegų pažintiniame take.</b></input>
    <label class="adresas" for="pristatymo-adresas">Pristatymo adresas:</label>
    <textarea class="adresas" rows="2" name="pristatymo-adresas" id="pristatymo-adresas" placeholder="Kur pristatyti inkiliuką..."></textarea>
    <input type="hidden" name="_subject" id="email-subject" value="Sėkmės inkilėlio rezervacija">
  </fieldset>

  <div data-netlify-recaptcha="true"></div>
  
  <input type="submit" value="Rezervuoti" />
</form>
<style>/* reset */
#fsr-frm input,
#fsr-frm select,
#fsr-frm textarea,
#fsr-frm fieldset,
#fsr-frm optgroup,
#fsr-frm label,
#fsr-frm #card-element:disabled {
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
#fsr-frm label,
#fsr-frm legend,
#fsr-frm ::placeholder {
  font-size: .825em;
  margin-bottom: .5em;
  padding-top: .2em;
  display: flex;
  align-items: baseline;
}
/* border, padding, margin, width */
#fsr-frm input,
#fsr-frm select,
#fsr-frm textarea,
#fsr-frm #card-element {
  border: 1px solid rgba(0,0,0,0.2);
  background-color: rgba(255,255,255,0.9);
  padding: .75em 1em;
  margin-bottom: 1.5em;
}
#fsr-frm input:focus,
#fsr-frm select:focus,
#fsr-frm textarea:focus {
  background-color: white;
  outline-style: solid;
  outline-width: thin;
  outline-color: gray;
  outline-offset: -1px;
}
#fsr-frm [type="text"],
#fsr-frm [type="email"] {
  width: 100%;
}
#fsr-frm [type="button"],
#fsr-frm [type="submit"],
#fsr-frm [type="reset"] {
  width: auto;
  cursor: pointer;
  -webkit-appearance: button;
  -moz-appearance: button;
  appearance: button;
}
#fsr-frm [type="button"]:focus,
#fsr-frm [type="submit"]:focus,
#fsr-frm [type="reset"]:focus {
  outline: none;
}
#fsr-frm [type="submit"],
#fsr-frm [type="reset"] {
  margin-bottom: 0;
}
#fsr-frm select {
  text-transform: none;
}
#fsr-frm [type="checkbox"] {
  -webkit-appearance: checkbox;
  -moz-appearance: checkbox;
  appearance: checkbox;
  display: inline-block;
  width: auto;
  margin: 0 .5em 0 0;
}
#fsr-frm [type="checkbox"] {
  -webkit-appearance: checkbox;
  -moz-appearance: checkbox;
  appearance: checkbox;
  display: inline-block;
  width: auto;
  background: red;
  margin: 0 .5em 0 0;
}
#fsr-frm [type="radio"] {
  -webkit-appearance: radio;
  -moz-appearance: radio;
  appearance: radio;
}
/* address, locale */
#fsr-frm fieldset.locale input[name="city"],
#fsr-frm fieldset.locale select[name="state"],
#fsr-frm fieldset.locale input[name="city"] {
  width: 52%;
}
#fsr-frm fieldset.locale select[name="state"],
#fsr-frm fieldset.locale input[name="city"],
#fsr-frm fieldset.locale select[name="state"] {
  margin-right: 3%;
}
#fsr-frm  label {
  font-weight: bolder;
}
.pka {
  font-size: .825em;
}
.foo ~ div {
  display: none;=IaU[+pL3r
}
.foo:checked ~ div {
  display: initial;
}
.pka {
  font-size: .825em;
}
#pirkejas-kitas-asmuo.foo ~ .savininkas {
  display: none;
}
#pirkejas-kitas-asmuo.foo:checked ~ .savininkas {
  display: initial;
}
#pristatyti.foo ~ .adresas {
  display: none;
}
#pristatyti.foo:checked ~ .adresas {
  display: initial;
}
</style>
</br>

## Inkilėlių galerija

{{< gallery album="inkileliai" >}}

<style>
  .gallery {
  margin: 0.5em -4px 1.5em -4px;
  font-size: 0;
}

a[data-fancybox] {
  text-decoration: none;
  cursor: zoom-in;
}

.gallery a[data-fancybox] img {
  height: 100px;
  width: auto;
  max-width: inherit;
  display: inherit;
  margin: 0;
  padding: 4px;
  box-shadow: none;
  vertical-align: inherit;
}

.fancybox-caption {
  font-size: 1rem;
  line-height: 1.5rem;
  text-align: center;
}
</style>
