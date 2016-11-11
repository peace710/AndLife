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

	;__weex_define__("@weex-component/52ff07d6780c6b9d7dce68ecbf858d99", [], function(__weex_require__, __weex_exports__, __weex_module__){

	;
		__weex_module__.exports = {
			data:function () {return {
				list:[
					{url:'http://ww2.sinaimg.cn/bmiddle/920fda58jw1f9bkph0truj20kj0odjw3.jpg'},
					{url:'http://ww4.sinaimg.cn/mw1024/a13fa4bbgw1eouylimvfcj20g40o6myl.jpg'},
					{url:'http://ww1.sinaimg.cn/mw1024/a13fa4bbgw1eqk2g9j530j20go0m80v8.jpg'}
				],
				title:'nba'
			}},
			methods:{
				change:function(e){
					var index = e.index;
					var titles = ['nba','momo','rina'];
					this.title = titles[index];
				}
			}
		}

	;__weex_module__.exports.template = __weex_module__.exports.template || {}
	;Object.assign(__weex_module__.exports.template, {
	  "type": "div",
	  "children": [
	    {
	      "type": "slider",
	      "attr": {
	        "autoPlay": "true",
	        "interval": "1000"
	      },
	      "events": {
	        "change": "change"
	      },
	      "style": {
	        "width": 300,
	        "height": 280
	      },
	      "children": [
	        {
	          "type": "div",
	          "repeat": {
	            "expression": function () {return this.list},
	            "value": "v"
	          },
	          "children": [
	            {
	              "type": "image",
	              "attr": {
	                "src": function () {return this.v.url},
	                "resize": "cover"
	              },
	              "classList": [
	                "pic"
	              ]
	            }
	          ]
	        },
	        {
	          "type": "indicator"
	        }
	      ]
	    },
	    {
	      "type": "text",
	      "style": {
	        "fontSize": 48,
	        "width": 300,
	        "textAlign": "center"
	      },
	      "attr": {
	        "value": function () {return this.title}
	      }
	    }
	  ]
	})
	;__weex_module__.exports.style = __weex_module__.exports.style || {}
	;Object.assign(__weex_module__.exports.style, {
	  "pic": {
	    "width": 300,
	    "height": 280
	  }
	})
	})
	;__weex_bootstrap__("@weex-component/52ff07d6780c6b9d7dce68ecbf858d99", {
	  "transformerVersion": "0.3.1"
	},undefined)

/***/ }
/******/ ]);
