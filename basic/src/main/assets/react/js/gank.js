// JavaScript Document
var RequestUrl = createRequest();

var data = {
	'url':'http://gank.io/api/data/Android/30/1',
	'init': init,
	'render':render,
	'update':update
};


ReactDOM.render(
	<RequestUrl source = {data} />,
	document.getElementById('example')
);

function init(){
	return {
	  res: null
    }
}

function render(state){
	var items = state.res;
	if (!state.res){
		return <div></div>
	}else{
		var items = state.res.map(function(item){
			var liStyle={
				margin:'15px 0px',
				fontSize:'2.5em'
			};
			return (
				/*
				<div>
					<div>_id:{item._id}</div>
					<div>createdAt:{item.createdAt}</div>
					<div>desc:{item.desc}</div>
					<div>publishedAt:{item.publishedAt}</div>
					<div>source:{item.source}</div>
					<div>type:{item.type}</div>
					<div><a href={item.url}>url</a></div>
					<div>used:{item.used}</div>
					<div>who:{item.who}</div>
					<div>{show(item.images)}</div>
				</div>)
				*/
				<li style={liStyle}>
					<div><a href={item.url}>{item.desc}</a>{author(item.who)}</div>
					<div><a href={item.url}>{loadImages(item.images)}</a></div>
				</li>)
			});
			var ulStyle={
				listStyle:'disc',
			};
			var divStyle={
				padding:'2em 2em',
				margin:'10px'
			};
			var spanStyle={
				margin:'10px 20px',
				color:'#212121',
				fontSize:'3.5em',
				fontWeight:'bold'
			};
		return (<div style={divStyle}><span style={spanStyle}>今日推荐</span><ul style={ulStyle}>{items}</ul></div>);
	}
}

function author(who){
	var val = "";
	if (who){
		val = '(' + who + ')';
	}
	return <span>{val}</span>
}

function loadImages(images){
	console.log(images);
	if (!images){
		return <div></div>
	}
	var items = images.map(function(item){
		return <img src={item} id="image"></img>
	});
	
	return <div>{items}</div>;
	
}


function update(response){
	return {
	  	res : response.results
	}
}

function createRequest(){
	return React.createClass({
		getInitialState:function(){
			return this.props.source.init();
		},
		componentDidMount:function(){
			$.get(this.props.source.url,function(response){
				if (this.isMounted()){
					this.setState(update(response));
				}
			}.bind(this));
		},
		render:function(){
			return this.props.source.render(this.state);
		}
	});
}