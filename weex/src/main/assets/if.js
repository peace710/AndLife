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

	;__weex_define__("@weex-component/41f84169decaa9cd8654095506961d8b", [], function(__weex_require__, __weex_exports__, __weex_module__){

	;
		__weex_module__.exports = {
			data:function () {return {
				visible:true
			}},
			methods:{
				toggle:function(){
					this.visible = !this.visible;
				}
			}
		}

	;__weex_module__.exports.template = __weex_module__.exports.template || {}
	;Object.assign(__weex_module__.exports.template, {
	  "type": "container",
	  "style": {
	    "flexDirection": "column"
	  },
	  "children": [
	    {
	      "type": "text",
	      "classList": [
	        "content"
	      ],
	      "events": {
	        "click": "toggle"
	      },
	      "attr": {
	        "value": "Toggle"
	      }
	    },
	    {
	      "type": "image",
	      "classList": [
	        "thumb"
	      ],
	      "attr": {
	        "src": "http://ww4.sinaimg.cn/mw1024/a13fa4bbgw1eouylimvfcj20g40o6myl.jpg"
	      },
	      "shown": function () {return this.visible}
	    }
	  ]
	})
	;__weex_module__.exports.style = __weex_module__.exports.style || {}
	;Object.assign(__weex_module__.exports.style, {
	  "content": {
	    "fontSize": 50,
	    "color": "#008000"
	  },
	  "thumb": {
	    "width": 232,
	    "height": 348
	  }
	})
	})
	;__weex_bootstrap__("@weex-component/41f84169decaa9cd8654095506961d8b", {
	  "transformerVersion": "0.3.1"
	},undefined)

/***/ }
/******/ ]);