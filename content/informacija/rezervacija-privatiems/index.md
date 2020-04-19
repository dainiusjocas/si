---
aliases: [rezervacija-privatiems]
projects: [sekmes-inkilelis]
title: Reervacijos informacija
# authors: ["Geležinis vilkas"]
date: '2020-04-19'
tags: []
categories:
  - Informacija
summary: Rezervacijos informacija `
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

Mano tekstas <b id="param">XXXX</b> taskas.

Kiekis: <b id="kiekis">KIEKIS</b>

Suma: <b id="suma">SUMA</b>

<script>
  const params = new URLSearchParams(window.location.search);
  console.log(params.get('aaa'));

  document.getElementById('param').innerHTML = params.get('aaa');
  document.getElementById('kiekis').innerHTML = params.get('kiekis');
  document.getElementById('suma').innerHTML = params.get('suma');
</script>
