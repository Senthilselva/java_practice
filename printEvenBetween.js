(function printEvenBetween(begin, end){
	for(let i = begin; i < end; i++){
		if(i%2 == 0){
			console.log(i);
		}
	}
})(3,10)

/*
function printEvenBetween(a, b){
    var numbers = [];
    var start;
    var end;
    if(a < b){
        start = a;
        end = b;    
    }else{
        start = b;
        end = a;
    }

    for(var i=start + 1; i < end; i++){
        if(i % 2 == 0){
            numbers.push(i)
        }

    } 

    return numbers;

} 
*/