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

	;__weex_define__("@weex-component/1b10af12e6d25bed0cd9e1c98e3f3d86", [], function(__weex_require__, __weex_exports__, __weex_module__){

	;
		__webpack_require__(1)
		__weex_module__.exports = {
			data:function () {return {
				message:'child-parent'
			}},
			created:function(){
				this.$on('notify',function(e){
					this.message = e.detail.msg;
				})
			}
		}

	;__weex_module__.exports.template = __weex_module__.exports.template || {}
	;Object.assign(__weex_module__.exports.template, {
	  "type": "child",
	  "attr": {
	    "title": function () {return this.message},
	    "url": "http://ww4.sinaimg.cn/mw1024/a13fa4bbgw1eouylimvfcj20g40o6myl.jpg"
	  }
	})
	})
	;__weex_bootstrap__("@weex-component/1b10af12e6d25bed0cd9e1c98e3f3d86", {
	  "transformerVersion": "0.3.1"
	},undefined)

/***/ },
/* 1 */
/***/ function(module, exports) {

	;__weex_define__("@weex-component/child", [], function(__weex_require__, __weex_exports__, __weex_module__){

	;
		__weex_module__.exports = {
			data:function () {return {
				title:'',
				url:''
			}},
			methods:{
				notifyMsg:function(){
					this.$dispatch('notify',{msg:'a new message'})
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
	      "events": {
	        "click": "notifyMsg"
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