//Devuelve la suma de 1 a N. Por ejemplo,  Sum1toN(3) devolverá la suma de 1+2+3, la cual es 6
//sum1toN(255) devuelve la suma de todos los números de 1 a 255
function Sum1toN(n){
    let sum=0;
    for (let i = 1; i <= n; i++) {
        sum+=i;
        
    }
    return sum;
}
//devuelve la suma del primer y último número en el array
function sumFirstLast(arr){
    return arr[0]+arr[arr.length-1];
}
//devuelve la suma del numero maximo y minimo de un array
function sumMaxMin(arr){
    let max=arr[0];
    let min=arr[0];
    if(typeof arr === "boolean"){
        return "No acepto boleanos";
    }
    for (let i = 1; i < arr.length; i++) {
        if(arr[i]>max){
            max=arr[i];
        }
        if(arr[i]<min){
            min=arr[i];
        }
    }
    return max+min;
}
console.log(sumMaxMin([1,2,3,10]))
    
describe("Sum1toN", function() { 
    it("should return 3 when we pass 2 as an argument", function() { 
        expect(Sum1toN(2)).toEqual(3); 
    }); 
    it("should return 6 when we pass 3 as an argument", function() { 
        expect(Sum1toN(3)).toEqual(6); 
    }); 
    it("should return 10 when we pass 4 as an argument", function() { 
        expect(Sum1toN(4)).toEqual(10); 
    }); 
});
    
describe("sumFirstLast", function() { 
    it("should return 3 when we pass [1,2] as an argument", function() { 
        expect(sumFirstLast([1,2])).toEqual(3); 
    }); 
    it("should return 10 when we pass [2,3,8] as an argument", function() { 
        expect(sumFirstLast([2,3,8])).toEqual(10); 
    }); 
    it("should return -10 when we pass [-6,23,3,-4] as an argument", function() { 
        expect(sumFirstLast([-6,23,3,-4])).toEqual(-10); 
    }); 
});
describe("sumMaxMin", function() { 
    it("Debe retornar no acepto boleanos cuando se envia true", function() { 
        expect(sumMaxMin(true)).toEqual("No acepto boleanos"); 
    }); 
    it("Debe retornar no acepto boleanos cuando se envia false", function() { 
        expect(sumMaxMin(true)).toEqual("No acepto boleanos"); 
    }); 
    it("Debe retornar 11 cuando se envie [1,3,10]", function() { 
        expect(sumMaxMin([1,3,10])).toEqual(11); 
    }); 
    it("Debe retornar 100 cuando se envie [30,40,50,60,70]", function() { 
        expect(sumMaxMin([30,40,50,60,70])).toEqual(100); 
    }); 
});

