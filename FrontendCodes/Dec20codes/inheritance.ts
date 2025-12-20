 class Person{
     constructor(public name:string,public id:number){}

     sayHello(){
        console.log("hello,"+this.name)
     }
 }

 class Student extends Person implements User{
    constructor(public name:string,public id:number,public coursename:string){
        super(name,id)
     }

    getInfo(){
         console.log(this.name+ "registered info"+ this.coursename)
    }
 }

 let s:Student=new Student("swpana",345,"javascript","swpana@gmail.com","swapna123")
 s.sayHello()
s.getInfo()


interface User{
    email:string,
    pwd:string

    getCredentials():void;
}

class Employee implements User{
    constructor(public email:string,public pwd:string){
        this.email=email
        this.pwd=pwd
    }

    getCredentials(): void {
        console.log(this.email+ " "+ this.pwd)
    }
}

let e:Employee=new Employee("swapna@gmail.com","12345")
e.getCredentials()