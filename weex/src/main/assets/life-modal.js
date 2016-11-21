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

	;__weex_define__("@weex-component/60359bbd8b347166421406d30f90eef5", [], function(__weex_require__, __weex_exports__, __weex_module__){

	;
		var modal; 
		var that;
		__weex_module__.exports = {
			methods:{
				toast:function(){
					that.tip('I am toast!',2);
				},
				alert:function(){
					modal.alert({
						message: 'I am alert!',
						okTitle: 'ok'
					},function(){
						that.tip('Alert is completed!',2);
					})
				},
				confirm:function(){
					modal.confirm({
						message:'I am confirm!',
						okTitle:'ok',
						cancelTitle:'cancel'
					},function(result){
						that.tip(result,2);
					});
				},
				prompt:function(){
					modal.prompt({
						message:'I am prompt!',
						okTitle:'ok',
						cancelTitle:'cancel'
					},function(res){
						that.tip(res.result + ',' + res.data,2);
					});
				},
				tip:function(msg,duration){
					modal.toast({
						'message':msg,
						'duration':duration
					});
				}
			},
			init:function(){
				modal = __weex_require__('@weex-module/modal');
				that = this;
			}
		}

	;__weex_module__.exports.template = __weex_module__.exports.template || {}
	;Object.assign(__weex_module__.exports.template, {
	  "type": "container",
	  "children": [
	    {
	      "type": "text",
	      "events": {
	        "click": "toast"
	      },
	      "classList": [
	        "common"
	      ],
	      "attr": {
	        "value": "Toast"
	      }
	    },
	    {
	      "type": "text",
	      "events": {
	        "click": "alert"
	      },
	      "classList": [
	        "common"
	      ],
	      "attr": {
	        "value": "Alert"
	      }
	    },
	    {
	      "type": "text",
	      "events": {
	        "click": "confirm"
	      },
	      "classList": [
	        "common"
	      ],
	      "attr": {
	        "value": "Confirm"
	      }
	    },
	    {
	      "type": "text",
	      "events": {
	        "click": "prompt"
	      },
	      "classList": [
	        "common"
	      ],
	      "attr": {
	        "value": "Prompt"
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
	;__weex_bootstrap__("@weex-component/60359bbd8b347166421406d30f90eef5", {
	  "transformerVersion": "0.3.1"
	},undefined)

/***/ }
/******/ ]);