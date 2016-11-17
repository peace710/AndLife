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

	;__weex_define__("@weex-component/95533e4cab56e4debc2b4488b389d404", [], function(__weex_require__, __weex_exports__, __weex_module__){

	;
		var common = __weex_require__('@weex-module/commonModule');
		__weex_module__.exports = {
			data:function () {return {
				src:'http://gslb.miaopai.com/stream/gAg3h3zMUJJikFBAzZ5Maw__.mp4'
			}},
			methods:{
				start:function(){
					console.log('start');
					common.toast('start');
				},
				pause:function(){
					console.log('pause');
					common.toast('pause');
				},
				finish:function(){
					console.log('finish');
					common.toast('finish');
				},
				fail:function(){
					console.log('fail');
					common.toast('fail');
				}
			}
		}

	;__weex_module__.exports.template = __weex_module__.exports.template || {}
	;Object.assign(__weex_module__.exports.template, {
	  "type": "div",
	  "children": [
	    {
	      "type": "video",
	      "classList": [
	        "video"
	      ],
	      "attr": {
	        "autoPlay": "true",
	        "playStatus": "play",
	        "src": function () {return this.src}
	      },
	      "events": {
	        "start": "start",
	        "pause": "pause",
	        "finish": "finish",
	        "fail": "fail"
	      }
	    }
	  ]
	})
	;__weex_module__.exports.style = __weex_module__.exports.style || {}
	;Object.assign(__weex_module__.exports.style, {
	  "video": {
	    "width": 750,
	    "height": 420,
	  }
	})
	})
	;__weex_bootstrap__("@weex-component/95533e4cab56e4debc2b4488b389d404", {
	  "transformerVersion": "0.3.1"
	},undefined)

/***/ }
/******/ ]);