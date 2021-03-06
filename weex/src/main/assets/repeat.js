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

	;__weex_define__("@weex-component/b1d833477c37f2370a21a45c8c4ccee1", [], function(__weex_require__, __weex_exports__, __weex_module__){

	;
		__weex_module__.exports = {
			data:function () {return {
				list:[
					{gender:'male',avatar:'http://ww2.sinaimg.cn/bmiddle/920fda58jw1f9bkph0truj20kj0odjw3.jpg',nickname:'kobe&mcgrady'},
					{gender:'female',avatar:'http://ww4.sinaimg.cn/mw1024/a13fa4bbgw1eouylimvfcj20g40o6myl.jpg',nickname:'momo'},
					{gender:'female',avatar:'http://ww1.sinaimg.cn/mw1024/a13fa4bbgw1eqk2g9j530j20go0m80v8.jpg',nickname:'rina'}
				],
				group:'stars'
			}}
		}

	;__weex_module__.exports.template = __weex_module__.exports.template || {}
	;Object.assign(__weex_module__.exports.template, {
	  "type": "container",
	  "children": [
	    {
	      "type": "container",
	      "repeat": function () {return this.list},
	      "children": [
	        {
	          "type": "image",
	          "classList": [
	            "avatar"
	          ],
	          "attr": {
	            "src": function () {return this.avatar}
	          }
	        },
	        {
	          "type": "text",
	          "classList": function () {return [this.gender]},
	          "attr": {
	            "value": function () {return (this.nickname) + ' - ' + (this.group)}
	          }
	        }
	      ]
	    }
	  ]
	})
	;__weex_module__.exports.style = __weex_module__.exports.style || {}
	;Object.assign(__weex_module__.exports.style, {
	  "male": {
	    "color": "#0000FF",
	    "fontSize": 48
	  },
	  "female": {
	    "color": "#FF0000",
	    "fontSize": 48
	  },
	  "avatar": {
	    "width": 200,
	    "height": 200,
	    "webkitBorderRadius": 100
	  }
	})
	})
	;__weex_bootstrap__("@weex-component/b1d833477c37f2370a21a45c8c4ccee1", {
	  "transformerVersion": "0.3.1"
	},undefined)

/***/ }
/******/ ]);