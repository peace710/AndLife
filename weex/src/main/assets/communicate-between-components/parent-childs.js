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

	;__weex_define__("@weex-component/3ccaab35880b157258c5b860885a4436", [], function(__weex_require__, __weex_exports__, __weex_module__){

	;
		__webpack_require__(1)
		__weex_module__.exports = {
			methods:{
				update:function(){
					this.$broadcast('changeTitle',{title:'momo'});
					this.$broadcast('changeImage',{url:'http://ww4.sinaimg.cn/mw1024/a13fa4bbgw1eouylimvfcj20g40o6myl.jpg'})
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
	        "value": "Click to update childs"
	      }
	    },
	    {
	      "type": "life-text"
	    },
	    {
	      "type": "life-text"
	    }
	  ]
	})
	})
	;__weex_bootstrap__("@weex-component/3ccaab35880b157258c5b860885a4436", {
	  "transformerVersion": "0.3.1"
	},undefined)

/***/ },
/* 1 */
/***/ function(module, exports, __webpack_require__) {

	;__weex_define__("@weex-component/life-text", [], function(__weex_require__, __weex_exports__, __weex_module__){
	__webpack_require__(2);

	;
		__weex_module__.exports = {
			data:function () {return {
				title:''
			}},
			created:function(){
				var self = this;
				this.$on('changeTitle',function(e){
					self.title = e.detail.title;
				});
			}
		}

	;__weex_module__.exports.template = __weex_module__.exports.template || {}
	;Object.assign(__weex_module__.exports.template, {
	  "type": "div",
	  "children": [
	    {
	      "type": "life-image"
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

/***/ },
/* 2 */
/***/ function(module, exports) {

	;__weex_define__("@weex-component/life-image", [], function(__weex_require__, __weex_exports__, __weex_module__){

	;
		__weex_module__.exports = {
			data:function () {return {
				url:''
			}},
			created:function(){
				var self = this;
				this.$on('changeImage',function(e){
					self.url = e.detail.url;
				});
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
	    }
	  ]
	})
	})

/***/ }
/******/ ]);