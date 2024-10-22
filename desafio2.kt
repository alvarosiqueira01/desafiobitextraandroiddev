class BankAccount{
    private var balance: Double
        get(){
            return this.balance
        }
        set(amount: Double){
            if (amount < 0 && this.balance >= amount){
                withdrawal(amount)
            }
            if (amount < 0 && this.balance < amount){
                println("Error: insuficient balance for this transaction.")
            }
            if (amount >= 0){
                deposit(amount)
            }
        }
    public var accountHolder: String = ""
    constructor(accountHolder: String){
        this.balance = 0.0
        this.accountHolder = accountHolder
        
    }
    
    public fun deposit(amount: Double){
        this.balance = this.balance + amount
    }
    
    public fun withdrawal(amount: Double){
        this.balance = this.balance + amount
    }
    
    
}
