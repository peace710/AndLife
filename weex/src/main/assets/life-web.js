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

	;__weex_define__("@weex-component/f6b108b5cc0a46354aaad89d265df92e", [], function(__weex_require__, __weex_exports__, __weex_module__){

	;
		var common = __weex_require__('@weex-module/commonModule');
		__weex_module__.exports = {
			data:function () {return {
				src:'http://gank.io/'
			}},
			methods:{
				pagestart:function(){
					console.log('pagestart');
					common.toast('pagestart');
				},
				pagefinish:function(){
					console.log('pagefinish');
					common.toast('pagefinish');
				},
				error:function(){
					console.log('error');
					common.toast('error');
				}
			}
		}

	;__weex_module__.exports.template = __weex_module__.exports.template || {}
	;Object.assign(__weex_module__.exports.template, {
	  "type": "div",
	  "children": [
	    {
	      "type": "web",
	      "classList": [
	        "web"
	      ],
	      "attr": {
	        "src": function () {return this.src}
	      },
	      "events": {
	        "pagestart": "pagestart",
	        "pagefinish": "pagefinish",
	        "error": "error"
	      }
	    }
	  ]
	})
	;__weex_module__.exports.style = __weex_module__.exports.style || {}
	;Object.assign(__weex_module__.exports.style, {
	  "web": {
	    "justifyContent": "center",
	    "width": 750,
	    "height": 1200
	  }
	})
	})
	;__weex_bootstrap__("@weex-component/f6b108b5cc0a46354aaad89d265df92e", {
	  "transformerVersion": "0.3.1"
	},undefined)

/***/ }
/******/ ]);