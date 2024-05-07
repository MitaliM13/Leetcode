const createCounter=function(n){
    return function(){
        a=n;
        n++;
        return a;
    }
}