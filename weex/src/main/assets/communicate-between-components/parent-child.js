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
/***/ function(module, exports, __webpack_require__) {

	;__weex_define__("@weex-component/d48f84d7f902e8643cf11c050a22c55a", [], function(__weex_require__, __weex_exports__, __weex_module__){

	;
	__webpack_require__(1);
		__weex_module__.exports = {
			methods:{
				update:function(){
					var child = this.$vm('child');
					child.onUpdate('rina');
					child.url = 'http://ww1.sinaimg.cn/mw1024/a13fa4bbgw1eqk2g9j530j20go0m80v8.jpg';
				}
			}
		}

	;__weex_module__.exports.template = __weex_module__.exports.template || {}
	;Object.assign(__weex_module__.exports.template, {
	  "type": "div",
	  "children": [
	    {
	      "type": "text",
	      "style": {
	        "fontSize": 48
	      },
	      "events": {
	        "click": "update"
	      },
	      "attr": {
	        "value": "Click to update child"
	      }
	    },
	    {
	      "type": "another-child",
	      "id": "child",
	      "attr": {
	        "title": "Parent-Child",
	        "url": "http://ww4.sinaimg.cn/mw1024/a13fa4bbgw1eouylimvfcj20g40o6myl.jpg"
	      }
	    }
	  ]
	})
	})
	;__weex_bootstrap__("@weex-component/d48f84d7f902e8643cf11c050a22c55a", {
	  "transformerVersion": "0.3.1"
	},undefined)

/***/ },
/* 1 */
/***/ function(module, exports) {

	;__weex_define__("@weex-component/another-child", [], function(__weex_require__, __weex_exports__, __weex_module__){

	;
		__weex_module__.exports = {
			data:function () {return {
				title:'',
				url:''
			}},
			methods:{
				onUpdate:function(msg){
					this.title = msg;
				}
			}
		}

	;__weex_module__.exports.template = __weex_module__.exports.template || {}
	;Object.assign(__weex_module__.exports.template, {
	  "type": "div",
	  "children": [
	    {
	      "type": "image",
	      "attr": {
	        "src": function () {return this.url}
	      },
	      "style": {
	        "width": 145,
	        "height": 218
	      }
	    },
	    {
	      "type": "text",
	      "style": {
	        "fontSize": 48
	      },
	      "attr": {
	        "value": function () {return this.title}
	      }
	    }
	  ]
	})
	})

/***/ }
/******/ ]);