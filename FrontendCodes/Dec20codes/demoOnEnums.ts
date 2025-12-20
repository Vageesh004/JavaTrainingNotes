enum status1{
    PENDING=5,ACTIVE=10,APPROVED=15,REJECTED=20
}

let txStatus:status1=status1.PENDING

console.log(txStatus)

txStatus=status1.ACTIVE
console.log(txStatus)

if(txStatus==status1.ACTIVE)
    console.log("request is active,its in processing")