/*Tamaño Grande - Dado un array, escribe una función que cambie todos los números positivos en él, por el string “big”. 
Ejemplo: grande([-1,3,5,-5]) devuelve [-1, “big”, “big”, -5].*/
function StringPositivos(arr){
    for(let i=0;i<arr.length; i++){
        if(arr[i]>0){
            arr[i]="big";
        }
    }
    return arr;
}
console.log(StringPositivos([-1,3,5,-5]));
/*Imprime (print) el menor, devuelve (return) el mayor - Crea una función que tome un array de números. 
La función debería imprimir (print) el menor valor del array, y devolver (return) el mayor.*/
function  MaxMin(arr){
    let min=arr[0];
    let max=arr[0];
    for(let i=0;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
        }
        if(arr[i]>max){
            max=arr[i];
        }
    }
    console.log(min);
    return max;
}
console.log(MaxMin([5,1,4,8]));

/*Imprime (print) uno, devuelve (return) otro- Crea una función para un array de números. 
La función debería imprimir (print) el penúltimo valor y devolver (return) el primer valor impar.*/
function PrintAndReturn(arr){
    console.log(arr[arr.length-2]);
    for(let i=0;i<arr.length;i++){
        if(arr[i]%2==1){
            return arr[i];
        }
    }
}
console.log(PrintAndReturn([0,5,3,4,2]));

/*Doble Visión - Dado un array, crea una función que devuelva un nuevo array donde cada valor se duplique. 
Entonces, doble([1,2,3]) debiera devolver [2, 4, 6] sin cambiar el array original.*/
function ArrayDoble(arr){
    arrnuevo=[];
    for(let i=0; i<arr.length;i++){
        arrnuevo.push(arr[i]*2);
    }
    return arrnuevo;
}
console.log(ArrayDoble([1,2,3]));

/*Contar Positivos -  Dado un array de números, crea una función para reemplazar el último valor con el número de valores positivos 
encontrados en el array. Ejemplo, contarPositivos([-1,1,1,1]) cambia el array original y devuelve [-1,1,1,3].*/
function ContarPositivos(arr){
    let contador=0;
    for(let i=0;i<arr.length;i++){
        if(arr[i]>=0){
            contador+=1;
        }
    }
    arr[arr.length-1] =contador;
    return arr;
}
console.log(ContarPositivos([-1,1,1,1]));

/*Pares e Impares - Crea una función que acepte un array. Cada vez que ese array tenga 3 valores impares seguidos, imprime (print) 
“¡Qué imparcial!”, y cada vez que tenga 3 pares seguidos, imprime (print) “¡Es para bien!”.*/
function ParesImpares(arr){
    let pares=0;
    let impares=0;
    for(let i=0; i<arr.length;i++){
        if(arr[i]%2==0){
            pares+=1;
            impares=0;
            if(pares===3){
                console.log("¡Es para bien!");
                pares=0;
            }
        }
        else if(arr[i]%2==1){
            impares+=1;
            pares=0;
            if(impares==3){
                console.log("¡Qué imparcial!")
                impares=0;
            }
        }
    }
    return "Pares e Impares Consecutivos"
}
console.log(ParesImpares([1,5,7,9,2,4,6,8]));

/*Incrementa los Segundos - Dado un array de números llamado arr, suma 1 a los elementos, específicamente a aquellos cuyo índice es impar 
(arr[1], arr[3], arr[5], etc). Luego, imprime (console.log) cada valor del array y devuelve el arreglo arr.*/
function Incrementar(arr){
    for(let i=0;i<arr.length;i++){
        if(arr[i]%2==1){
            arr[i]+=1;
        }
        console.log(arr[i]);
    }
    return arr;
}
console.log(Incrementar([1,2,3,4,5,6,7,8,9,10]));
/*Longitudes previas - Pasado un array (similar a decir ‘tomado un array’ o ‘dado un array’) que contiene strings, reemplaza cada string con un número de acuerdo cantidad de letras 
(longitud) del string anterior. Por ejemplo, longitudesPrevias([“programar”,“dojo”, “genial”]) debería devolver [“programar”,9, 4]. Pista: ¿For loops solo puede ir hacia adelante?*/
function Longitudes(arr){
let longitudPrevia=arr[0].length;
    for(let i=1; i<arr.length; i++){
        let LongitudNueva= arr[i].length;
        arr[i]= longitudPrevia;
        longitudPrevia= LongitudNueva;
    }
    return arr;
}
console.log(Longitudes(["programar","dojo", "genial"]));
/*Agrega Siete - Construye una función que acepte un array. Devuelve un nuevo array con todos los valores del original, pero sumando 7 a cada uno. No alteres el array original.
Por ejemplo, agregaSiete([1,2,3) debería devolver [8,9,10] en un nuevo array.*/ 
function ArraySum7(arr){
    let NuevoArray=[];
    for(let i=0;i<arr.length;i++){
        NuevoArray.push(arr[i]+7)
    }
    return NuevoArray;
}
console.log(ArraySum7([1,2,3]));

/*Array Inverso - Dado un array, escribe una función que invierte sus valores en el lugar. Ejemplo: invertir([3,1,6,4,2)) devuelve el mismo array
pero con sus valores al revés, es decir [2,4,6,1,3]. Haz esto sin crear un array temporal vacío. (Pista: necesitarás intercambiar (swap) valores).*/
function reversa(arr){
    let nuevoarray=[]
    for(let i=arr.length-1;i>=0;i--){
        nuevoarray.push(arr[i]);
    }
    return nuevoarray;
}
console.log(reversa([3,1,6,4,2]));
/*Perspectiva: Negativa - Dado un array crear y devuelve uno nuevo que contenga todos los valores del array original, pero negativos
(no simplemente multiplicando por -1). Dado [1,-3,5], devuelve [-1,-3,-5].*/
function arraynegativo(arr){
    let nuevoarray=[];
    for(let i=0;i<arr.length;i++){
        if(arr[i]>0){
            nuevoarray.push(-arr[i]);
        }
        else{
            nuevoarray.push(arr[i])
        }
    }
    return nuevoarray;
}
console.log(arraynegativo([1,-3,5,-5,2]));

/*Siempre hambriento - Crea una función que acepte un array e imprima (print) “yummy” cada vez que alguno de los valores sea “comida”. 
Si ningún valor es “comida”, entonces imprime “tengo hambre” una vez.*/
function hambriento(arr){
    let contador=0;
    for(let i=0;i<arr.length;i++){
        if(arr[i]==="comida"){
            console.log("yummy");
        }
        else{
            contador+=1;
        }
        if(contador===arr.length){
            console.log("tengo hambre");
        }
    }
    return "Funcion hambrienta"
}
console.log(hambriento([1,"comida",3,"yummy"]));

/*Cambiar hacia el centro -  Dado un array, cambia el primer y último valor, el tercero con el ante penútimo, etc. Ejemplo: cambiaHaciaElCentro([true, 42, “Ada”, 2, “pizza”])
cambia el array a [“pizza¨, 42, “Ada”, 2, true]. cambiaHaciaElCentro([1,2,3,4,5,6]) cambia el array a [6,2,4,3,5,1]. No es necesario devolver (return) el array esta vez.*/
function centro(arr){
    valor1=arr[0];
    arr[0]=arr[arr.length-1];
    arr[arr.length-1]=valor1;
    if(arr.length%2==0){
        let valormedio=arr[arr.length/2-1];
        arr[arr.length/2-1]=arr[arr.length/2];
        arr[arr.length/2]=valormedio;
    }
    return arr;
}
console.log(centro([true, 42, "Ada",2, "pizza"]));
console.log(centro([1,2,3,4,5,6]))
/*Escala el Array - Dado un array arr y un número num, multiplica todos los valores en el array arr
por el número num, y devuelve el array arr modificado. Por ejemplo, escalaArray([1,2,3], 3] debería devolver [3,6,9].*/
function multiplicar(arr,y){
    for(let i=0;i<arr.length;i++){
        arr[i]*=y;
    }
    return arr;
}
console.log(multiplicar([1,2,7,3],3));