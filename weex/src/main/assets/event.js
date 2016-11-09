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

	;__weex_define__("@weex-component/de415146e6d8bbb27c8abf5b5e3d8a1c", [], function(__weex_require__, __weex_exports__, __weex_module__){

	;
		__weex_module__.exports = {
			data:function () {return {
				name:['James','Kobe','Iverson'],
				user_name:'Ray',
				desc:'method desc'
			}},
			methods:{
				changeName:function(){
					var index = Math.round(Math.random() * 2);
					this.user_name = this.name[index];
				},
				changeDesc:function(arg,e){
					var target = e.target;
					if (target.attr.value == 'method desc'){
						var val = 'The ' + arg + ' method executes at ' + e.timestamp + ',type is ' + e.type;
						this.desc = val;
					}
				}
			}
		}

	;__weex_module__.exports.template = __weex_module__.exports.template || {}
	;Object.assign(__weex_module__.exports.template, {
	  "type": "container",
	  "children": [
	    {
	      "type": "text",
	      "classList": [
	        "content"
	      ],
	      "events": {
	        "click": "changeName"
	      },
	      "attr": {
	        "value": function () {return this.user_name}
	      }
	    },
	    {
	      "type": "text",
	      "classList": [
	        "content"
	      ],
	      "events": {
	        "click": function ($event) {this.changeDesc('changeDesc',$event)}
	      },
	      "attr": {
	        "value": function () {return this.desc}
	      }
	    }
	  ]
	})
	;__weex_module__.exports.style = __weex_module__.exports.style || {}
	;Object.assign(__weex_module__.exports.style, {
	  "content": {
	    "fontSize": 36
	  }
	})
	})
	;__weex_bootstrap__("@weex-component/de415146e6d8bbb27c8abf5b5e3d8a1c", {
	  "transformerVersion": "0.3.1"
	},undefined)

/***/ }
/******/ ]);