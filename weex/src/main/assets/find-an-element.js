/******/ (function(modules) { // webpackBootstrap
/******/ 	// The module cache
/******/ 	var installedModules = {};

/******/ 	// The require function
/******/ 	function __webpack_require__(moduleId) {

/******/ 		// Check if module is in cache
/******/ 		if(installedModules[moduleId])
/******/ 			return installedModules[moduleId].exports;

/******/ 		// Create a new module (and put it into the cache)
/******/ 		var module = installedModules[moduleId] = {
/******/ 			exports: {},
/******/ 			id: moduleId,
/******/ 			loaded: false
/******/ 		};

/******/ 		// Execute the module function
/******/ 		modules[moduleId].call(module.exports, module, module.exports, __webpack_require__);

/******/ 		// Flag the module as loaded
/******/ 		module.loaded = true;

/******/ 		// Return the exports of the module
/******/ 		return module.exports;
/******/ 	}


/******/ 	// expose the modules object (__webpack_modules__)
/******/ 	__webpack_require__.m = modules;

/******/ 	// expose the module cache
/******/ 	__webpack_require__.c = installedModules;

/******/ 	// __webpack_public_path__
/******/ 	__webpack_require__.p = "";

/******/ 	// Load entry module and return exports
/******/ 	return __webpack_require__(0);
/******/ })
/************************************************************************/
/******/ ([
/* 0 */
/***/ function(module, exports) {

	;__weex_define__("@weex-component/afc569792c78d7efae7fe676a4c9af82", [], function(__weex_require__, __weex_exports__, __weex_module__){

	;
		var dom = __weex_require__('@weex-module/dom');
		__weex_module__.exports = {
			data:function () {return {
				content:''
			}},
			methods:{
				info:function(){
					var top = this.$el('top');
					this.content = top;
					dom.updateAttrs(top, {"value":"hello"});
					dom.updateStyle(top, {"color":"green","fontSize":48});
					//dom.scrollToElement(top,{offset:0});
				}
			}
		}

	;__weex_module__.exports.template = __weex_module__.exports.template || {}
	;Object.assign(__weex_module__.exports.template, {
	  "type": "container",
	  "children": [
	    {
	      "type": "text",
	      "id": "top",
	      "attr": {
	        "value": "Top"
	      }
	    },
	    {
	      "type": "container",
	      "style": {
	        "height": 720,
	        "backgroundColor": "#990022"
	      },
	      "children": [
	        {
	          "type": "text",
	          "attr": {
	            "value": function () {return this.content}
	          }
	        }
	      ]
	    },
	    {
	      "type": "text",
	      "style": {
	        "fontSize": 48
	      },
	      "events": {
	        "click": "info"
	      },
	      "attr": {
	        "value": "TopInfo"
	      }
	    }
	  ]
	})
	})
	;__weex_bootstrap__("@weex-component/afc569792c78d7efae7fe676a4c9af82", {
	  "transformerVersion": "0.3.1"
	},undefined)

/***/ }
/******/ ]);