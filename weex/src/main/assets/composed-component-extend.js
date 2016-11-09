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

	;__weex_define__("@weex-component/7ba13400dd51ddc3cb8d22f8103437cb", [], function(__weex_require__, __weex_exports__, __weex_module__){
	__webpack_require__(1);

	;
		__weex_module__.exports = {
			data:function () {return {
				description:'Composed Component',
				list:[
				{text:'kobe&mcgrady',img:'http://ww2.sinaimg.cn/bmiddle/920fda58jw1f9bkph0truj20kj0odjw3.jpg'},
				{text:'momo',img:'http://ww4.sinaimg.cn/mw1024/a13fa4bbgw1eouylimvfcj20g40o6myl.jpg'},
				{text:'rina',img:'http://ww1.sinaimg.cn/mw1024/a13fa4bbgw1eqk2g9j530j20go0m80v8.jpg'}
				]
			}}
		}

	;__weex_module__.exports.template = __weex_module__.exports.template || {}
	;Object.assign(__weex_module__.exports.template, {
	  "type": "icon-list",
	  "attr": {
	    "list": function () {return this.list}
	  }
	})
	})
	;__weex_bootstrap__("@weex-component/7ba13400dd51ddc3cb8d22f8103437cb", {
	  "transformerVersion": "0.3.1"
	},undefined)

/***/ },
/* 1 */
/***/ function(module, exports, __webpack_require__) {

	;__weex_define__("@weex-component/icon-list", [], function(__weex_require__, __weex_exports__, __weex_module__){
	__webpack_require__(2);

	;
		__weex_module__.exports = {
			data:function () {return {
				decription:'',
				list:[]
			}}
		}

	;__weex_module__.exports.template = __weex_module__.exports.template || {}
	;Object.assign(__weex_module__.exports.template, {
	  "type": "container",
	  "children": [
	    {
	      "type": "text",
	      "classList": [
	        "desc"
	      ],
	      "attr": {
	        "value": function () {return this.decription}
	      }
	    },
	    {
	      "type": "icon",
	      "repeat": function () {return this.list},
	      "attr": {
	        "title": function () {return this.text},
	        "image": function () {return this.img}
	      }
	    }
	  ]
	})
	;__weex_module__.exports.style = __weex_module__.exports.style || {}
	;Object.assign(__weex_module__.exports.style, {
	  "desc": {
	    "fontSize": 48
	  }
	})
	})

/***/ },
/* 2 */
/***/ function(module, exports) {

	;__weex_define__("@weex-component/icon", [], function(__weex_require__, __weex_exports__, __weex_module__){

	;
		__weex_module__.exports = {
			data:function () {return {
				image:null,
				title:null
			}}
		}

	;__weex_module__.exports.template = __weex_module__.exports.template || {}
	;Object.assign(__weex_module__.exports.template, {
	  "type": "container",
	  "style": {
	    "flexDirection": "row"
	  },
	  "children": [
	    {
	      "type": "image",
	      "classList": [
	        "pic"
	      ],
	      "attr": {
	        "src": function () {return this.image}
	      }
	    },
	    {
	      "type": "text",
	      "classList": [
	        "content"
	      ],
	      "attr": {
	        "value": function () {return this.title}
	      }
	    }
	  ]
	})
	;__weex_module__.exports.style = __weex_module__.exports.style || {}
	;Object.assign(__weex_module__.exports.style, {
	  "pic": {
	    "width": 150,
	    "height": 150
	  },
	  "content": {
	    "fontSize": 48,
	    "color": "#FF0000"
	  }
	})
	})

/***/ }
/******/ ]);