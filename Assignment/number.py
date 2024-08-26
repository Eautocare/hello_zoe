'''prompt the user to the amount he wants to borrow
store it
prompt the user for interest rate
store it
prompt the user the number of years
store it
calculate the monthly payment with the formula given'''

amount = int(input("Enter the principal amount: "))
rate = int(input("Enter the annual interest rate: "))
years = int(input("Enter the duration in years: "))

monthlyrate = amount/100
newrate = monthlyrate * math.pow(1+ monthlyrate, years)
newrate2 = math.pow(1+ monthlyrate, years) -1
monthlypayment = 