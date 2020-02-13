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

<div id='collection-component-1581612857923'></div>
<script type="text/javascript">
/*<![CDATA[*/
(function () {
  var scriptURL = 'https://sdks.shopifycdn.com/buy-button/latest/buy-button-storefront.min.js';
  if (window.ShopifyBuy) {
    if (window.ShopifyBuy.UI) {
      ShopifyBuyInit();
    } else {
      loadScript();
    }
  } else {
    loadScript();
  }
  function loadScript() {
    var script = document.createElement('script');
    script.async = true;
    script.src = scriptURL;
    (document.getElementsByTagName('head')[0] || document.getElementsByTagName('body')[0]).appendChild(script);
    script.onload = ShopifyBuyInit;
  }
  function ShopifyBuyInit() {
    var client = ShopifyBuy.buildClient({
      domain: 'sekmes-inkilelis.myshopify.com',
      storefrontAccessToken: '6de914b8c6faf16df5080f4b9adea0fe',
    });
    ShopifyBuy.UI.onReady(client).then(function (ui) {
      ui.createComponent('collection', {
        id: '156244213899',
        node: document.getElementById('collection-component-1581612857923'),
        moneyFormat: '%E2%82%AC%7B%7Bamount_with_comma_separator%7D%7D',
        options: {
  "product": {
    "styles": {
      "product": {
        "@media (min-width: 601px)": {
          "max-width": "calc(25% - 20px)",
          "margin-left": "20px",
          "margin-bottom": "50px",
          "width": "calc(25% - 20px)"
        },
        "img": {
          "height": "calc(100% - 15px)",
          "position": "absolute",
          "left": "0",
          "right": "0",
          "top": "0"
        },
        "imgWrapper": {
          "padding-top": "calc(75% + 15px)",
          "position": "relative",
          "height": "0"
        }
      },
      "button": {
        ":hover": {
          "background-color": "#502929"
        },
        "background-color": "#2f1818",
        ":focus": {
          "background-color": "#502929"
        }
      }
    },
    "buttonDestination": "checkout",
    "contents": {
      "button": false,
      "buttonWithQuantity": true
    },
    "text": {
      "button": "Pirkti"
    }
  },
  "productSet": {
    "styles": {
      "products": {
        "@media (min-width: 601px)": {
          "margin-left": "-20px"
        }
      }
    }
  },
  "modalProduct": {
    "contents": {
      "img": false,
      "imgWithCarousel": true,
      "button": false,
      "buttonWithQuantity": true
    },
    "styles": {
      "product": {
        "@media (min-width: 601px)": {
          "max-width": "100%",
          "margin-left": "0px",
          "margin-bottom": "0px"
        }
      },
      "button": {
        ":hover": {
          "background-color": "#502929"
        },
        "background-color": "#2f1818",
        ":focus": {
          "background-color": "#502929"
        }
      }
    },
    "text": {
      "button": "Add to cart"
    }
  },
  "cart": {
    "styles": {
      "button": {
        ":hover": {
          "background-color": "#502929"
        },
        "background-color": "#2f1818",
        ":focus": {
          "background-color": "#502929"
        }
      }
    },
    "text": {
      "total": "Subtotal",
      "button": "Checkout"
    }
  },
  "toggle": {
    "styles": {
      "toggle": {
        "background-color": "#2f1818",
        ":hover": {
          "background-color": "#502929"
        },
        ":focus": {
          "background-color": "#502929"
        }
      }
    }
  }
},
      });
    });
  }
})();
/*]]>*/
</script>
