---
aliases: [kaip-isigyti]
projects: [sekmes-inkilelis]
title: Kaip įsigyti
# authors: ["Geležinis vilkas"]
date: '2019-12-12'
tags: []
categories:
  - Informacija
summary: Instrukcijos kaip įsigyti inkilėlį
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

<form id="fs-frm" name="survey-form" accept-charset="utf-8" method="post" data-netlify-recaptcha="true" netlify action="/si">
  <fieldset id="fs-frm-inputs">
    <label for="full-name">Pirkėjo vardas ir pavardė:</label>
    <input type="text" name="name" id="full-name" placeholder="Vardenis Pavardenis" required="true">
    <div>
      <input type="checkbox" class="foo" id="pirkejas-kitas-asmuo" name="pirkejas-kitas-asmuo" value="pirkejas-kitas-asmuo"><b class="pka">Pirkėjas kitas asmuo?</b></input>
      <div class="inputs">
        <label for="savininko-vardas-ir-pavarde">Inkilėlio savininko vardas ir pavardė:</label>
        <input type="text" name="name" id="savininko-vardas-ir-pavarde" placeholder="Vardenis Pavardenis">
      </div>
      <style>
        .pka {
          font-size: .825em;
        }
        .foo ~ div {
          display: none;
        }
        .foo:checked ~ div {
          display: initial;
        }
      </style>
    </div>
    <label for="email-address">Kontaktiniai duomenys (el. paštas, telefono numeris):</label>
    <input type="text" name="kontaktiniai-duomenys" id="kontaktiniai-duomenys" placeholder="+37060000000" required="true">
    <label for="kiekis">Kiekis:</label>
    <input type="number" name="kiekis" id="kiekis" required="true" value="1" min="1" max="10"></input>
    <label for="skiriama-suma">Skiriame suma:</label>
    <input type="number" name="skiriama-suma" id="skiriama-sume" value="30" min="30" max="100"></input>
    <div>
      <input type="checkbox" class="foo" id="pristatyti" name="pristatyti" value="pristatyti"><b class="pka">Pristatyti inkiliuką nurodytu adresu? Nepažymėjus, pakabinsime Sapiegų pažintiniame take.</b></input>
      <div class="inputs">
        <label for="pristatymo-adresas">Pristatymo adresas:</label>
        <textarea rows="2" name="pristatymo-adresas" id="pristatymo-adresas" placeholder="Kur pristatyti inkiliuką..."></textarea>
      </div>
      <style>
        .pka {
          font-size: .825em;
        }
        .foo ~ div {
          display: none;
        }
        .foo:checked ~ div {
          display: initial;
        }
      </style>
    </div>
    <input type="hidden" name="_subject" id="email-subject" value="Sėkmės inkilėlio rezervacija">
  </fieldset>

  <div data-netlify-recaptcha="true"></div>
  
  <input type="submit" value="Rezervuoti" />
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
#fs-frm [type="checkbox"] {
  -webkit-appearance: checkbox;
  -moz-appearance: checkbox;
  appearance: checkbox;
  display: inline-block;
  width: auto;
  margin: 0 .5em 0 0;
}
#fs-frm [type="checkbox"] {
  -webkit-appearance: checkbox;
  -moz-appearance: checkbox;
  appearance: checkbox;
  display: inline-block;
  width: auto;
  background: red;
  margin: 0 .5em 0 0;
}
#fs-frm [type="radio"] {
  -webkit-appearance: radio;
  -moz-appearance: radio;
  appearance: radio;
}
/* address, locale */
#fs-frm fieldset.locale input[name="city"],
#fs-frm fieldset.locale select[name="state"],
#fs-frm fieldset.locale input[name="city"] {
  width: 52%;
}
#fs-frm fieldset.locale select[name="state"],
#fs-frm fieldset.locale input[name="city"],
#fs-frm fieldset.locale select[name="state"] {
  margin-right: 3%;
}
#fs-frm  label {
  font-weight: bolder;
}
</style>
