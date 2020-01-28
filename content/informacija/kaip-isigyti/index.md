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

<div>
  <div id="product-component-1575718950737"></div>
  <script type="text/javascript">
    /*<![CDATA[*/
    (function() {
      var scriptURL =
        "https://sdks.shopifycdn.com/buy-button/latest/buy-button-storefront.min.js";
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
        var script = document.createElement("script");
        script.async = true;
        script.src = scriptURL;
        (
          document.getElementsByTagName("head")[0] ||
          document.getElementsByTagName("body")[0]
        ).appendChild(script);
        script.onload = ShopifyBuyInit;
      }
      function ShopifyBuyInit() {
        var client = ShopifyBuy.buildClient({
          domain: "sekmes-inkilelis.myshopify.com",
          storefrontAccessToken: "6de914b8c6faf16df5080f4b9adea0fe"
        });
        ShopifyBuy.UI.onReady(client).then(function(ui) {
          ui.createComponent("product", {
            id: "4376514986123",
            node: document.getElementById(
              "product-component-1575718950737"
            ),
            moneyFormat:
              "%E2%82%AC%7B%7Bamount_with_comma_separator%7D%7D",
            options: {
              product: {
                styles: {
                  product: {
                    "@media (min-width: 601px)": {
                      "max-width": "100%",
                      "margin-left": "0",
                      "margin-bottom": "50px"
                    },
                    "text-align": "left"
                  },
                  title: {
                    "font-size": "26px"
                  },
                  price: {
                    "font-size": "18px"
                  },
                  compareAt: {
                    "font-size": "15.299999999999999px"
                  }
                },
                buttonDestination: "checkout",
                layout: "horizontal",
                contents: {
                  img: false,
                  imgWithCarousel: true,
                  button: false,
                  buttonWithQuantity: true,
                  description: true
                },
                width: "100%",
                text: {
                  button: "Pirkti"
                }
              },
              productSet: {
                styles: {
                  products: {
                    "@media (min-width: 601px)": {
                      "margin-left": "-20px"
                    }
                  }
                }
              },
              modalProduct: {
                contents: {
                  img: false,
                  imgWithCarousel: true,
                  button: false,
                  buttonWithQuantity: true
                },
                styles: {
                  product: {
                    "@media (min-width: 601px)": {
                      "max-width": "100%",
                      "margin-left": "0px",
                      "margin-bottom": "0px"
                    }
                  }
                },
                text: {
                  button: "Add to cart"
                }
              },
              cart: {
                text: {
                  total: "Subtotal",
                  button: "Checkout"
                }
              }
            }
          });
        });
      }
    })();
    /*]]>*/
  </script>

</div>
