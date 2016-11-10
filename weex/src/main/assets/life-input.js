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

	var __weex_template__ = __webpack_require__(1)
	var __weex_style__ = __webpack_require__(2)
	var __weex_script__ = __webpack_require__(3)

	__weex_define__('@weex-component/bd35d0aba93004aced0b0c63a0a919eb', [], function(__weex_require__, __weex_exports__, __weex_module__) {

	    __weex_script__(__weex_module__, __weex_exports__, __weex_require__)
	    if (__weex_exports__.__esModule && __weex_exports__.default) {
	      __weex_module__.exports = __weex_exports__.default
	    }

	    __weex_module__.exports.template = __weex_template__

	    __weex_module__.exports.style = __weex_style__

	})

	__weex_bootstrap__('@weex-component/bd35d0aba93004aced0b0c63a0a919eb',undefined,undefined)

/***/ },
/* 1 */
/***/ function(module, exports) {

	module.exports = {
	  "type": "div",
	  "children": [
	    {
	      "type": "input",
	      "attr": {
	        "type": "text",
	        "autofocus": "true",
	        "placeholder": "text"
	      },
	      "classList": [
	        "input"
	      ],
	      "events": {
	        "input": "getValue"
	      }
	    },
	    {
	      "type": "input",
	      "attr": {
	        "type": "text",
	        "disabled": "true",
	        "value": "no input"
	      },
	      "classList": [
	        "input"
	      ]
	    },
	    {
	      "type": "input",
	      "attr": {
	        "type": "password",
	        "placeholder": "password"
	      },
	      "classList": [
	        "input"
	      ]
	    },
	    {
	      "type": "input",
	      "attr": {
	        "type": "tel",
	        "placeholder": "tel"
	      },
	      "classList": [
	        "input"
	      ]
	    },
	    {
	      "type": "input",
	      "attr": {
	        "type": "email",
	        "placeholder": "email"
	      },
	      "classList": [
	        "input"
	      ]
	    },
	    {
	      "type": "input",
	      "attr": {
	        "type": "url",
	        "placeholder": "url"
	      },
	      "classList": [
	        "input"
	      ],
	      "style": {
	        "placeholderColor": "red"
	      }
	    },
	    {
	      "type": "text",
	      "classList": [
	        "input"
	      ],
	      "attr": {
	        "value": function () {return this.value}
	      }
	    }
	  ]
	}

/***/ },
/* 2 */
/***/ function(module, exports) {

	module.exports = {
	  "input": {
	    "width": 480,
	    "height": 100,
	    "fontSize":50
	  }
	}

/***/ },
/* 3 */
/***/ function(module, exports) {

	module.exports = function(module, exports, __weex_require__){'use strict';

	module.exports = {
		data: function () {return {
			value: ''
		}},
		methods: {
			getValue: function getValue(e) {
				this.value = e.value;
			}
		}
	};}
	/* generated by weex-loader */


/***/ }
/******/ ]);