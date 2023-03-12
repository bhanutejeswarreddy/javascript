class Account{
    mini_bal=500;
    get_Accountdetails(){
        console.log("Display the Account details");
    }
    get_Accountbal(){
        console.log("Your Account bal:",this.mini_bal);
    }
}
class saving_Account extends Account{}
class current_Account extends Account{
    minbal=5000;
    get_Accountbal(){
        console.log("Your Account bal:",this.minbal);
    }
}
let sa=new saving_Account();
sa.get_Accountdetails();
sa. get_Accountbal();
