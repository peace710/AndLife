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

	;__weex_define__("@weex-component/274baedf0d364b14b2f078e05e181b78", [], function(__weex_require__, __weex_exports__, __weex_module__){

	;
		var that;
		var isRun;
		var timer;
		__weex_module__.exports = {
			data:function () {return {
				src:0
			}},
			methods:{
				start:function(){
					if (!isRun){
						isRun = true;
						timer = setInterval(this.onRepeat,2000);
					}
				},
				stop:function(){
					if (isRun){
						isRun = false;
						clearInterval(timer);
					}
				},
				delay:function(){
					setTimeout(function(){
						that.tip('execute setTimeout',2);
						clearTimeout(this);
					},5000);
				},
				tip:function(msg,time){
					var modal = __weex_require__('@weex-module/modal');
					modal.toast({
						message:msg,
						duration:time
					});
				},
				onRepeat:function(){
					that.src++;
				}
			},
			init:function(){
				that = this;
				isRun = false;
			}
		}

	;__weex_module__.exports.template = __weex_module__.exports.template || {}
	;Object.assign(__weex_module__.exports.template, {
	  "type": "container",
	  "children": [
	    {
	      "type": "text",
	      "classList": [
	        "common"
	      ],
	      "events": {
	        "click": "start"
	      },
	      "attr": {
	        "value": "Start Timer"
	      }
	    },
	    {
	      "type": "text",
	      "classList": [
	        "common"
	      ],
	      "events": {
	        "click": "stop"
	      },
	      "attr": {
	        "value": "Stop Timer"
	      }
	    },
	    {
	      "type": "text",
	      "classList": [
	        "common"
	      ],
	      "events": {
	        "click": "delay"
	      },
	      "attr": {
	        "value": "Delay"
	      }
	    },
	    {
	      "type": "text",
	      "classList": [
	        "common"
	      ],
	      "attr": {
	        "value": function () {return this.src}
	      }
	    }
	  ]
	})
	;__weex_module__.exports.style = __weex_module__.exports.style || {}
	;Object.assign(__weex_module__.exports.style, {
	  "common": {
	    "fontSize": 36,
	    "margin": 15
	  }
	})
	})
	;__weex_bootstrap__("@weex-component/274baedf0d364b14b2f078e05e181b78", {
	  "transformerVersion": "0.3.1"
	},undefined)

/***/ }
/******/ ]);