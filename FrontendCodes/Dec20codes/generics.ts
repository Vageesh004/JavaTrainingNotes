function sayHello<T>(t: T):void{
    console.log(t)
}

function getName(name:string):string{
    return name.toUpperCase();
}
sayHello("swapna")

let p={
    name:"swapna",
    id:456
}

sayHello(p)
sayHello(getName("teja"))

let myname="pooja"


class Container<T> {
    constructor(t:T){public t:T}

    getValue():T{
        return this.t;
    }


}

let numContainer:Container<number>=new Container(56);
let nameContainer=Container<string>=new Container("Astha");
let objectContainer=Container<

