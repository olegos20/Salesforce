window.onload = function(){
	var todolist = [];
document.getElementById('add').onclick = function(){
	var z = document.getElementById('in').value;
	//{todo: New}
	var temp = {};
	temp.todo = z;
	var i = todolist.length;
	todolist[i] = temp;
	console.log(todolist);
	out();
}

function out(){
	var out='';
	for (var key in todolist){
		out+='<li>'+todolist[key].todo+'</li>';
	}
document.getElementById('task_list').innerHTML = out;
}
}