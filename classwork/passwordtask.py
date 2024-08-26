'''
prompt for password
store in variable as password
get the length of the password 
display password in asterisk
'''

password = input("Enter password: ")
password_count = len(password)
password_asterisk = '*'  * password_count
print(password_asterisk)