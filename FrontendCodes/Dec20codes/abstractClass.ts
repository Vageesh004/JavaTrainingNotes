abstract class Account{
    accno:string
    accName:string
    ifsc:string

    constructor(accno:string,accName:string,ifsc:string){
        this.accno=accno;
        this.accName=accName;
        this.ifsc=ifsc;
    }
}

class SavingsAccount extends Account{
    balance:number

    constructor(accno:string,accName:string,ifsc:string,balance:number){
        super(accno,accName,ifsc)
        this.balance=balance
    }
}

let sa:SavingsAccount=new SavingsAccount("6785678976","swapna","icici",60000);
console.log(sa)