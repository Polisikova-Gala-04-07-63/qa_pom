*Title*
*Steps*
*Expected result*

**Test cases**

**Login Page*

*ID*: ts_l1
*Pre-conditions:* Exiting user, known 
username and password test@gmail.com, 
logged out, login page opened 
//Выходящий пользователь, известный
логин и пароль test@gmail.com,
вышел из системы, страница входа открыта//
*Title:* Auth with valid email and password, 
already exiting user //Авторизация с действующим
адресом электронной почты и паролем,
уже выходящий пользователь//
*Steps:*
1. Enter valid email, password.
2. Press Enter "Login" button
*Expected result* Contacts page is opened,

*ID*: tc_l2 
*Pre-conditions:* Logged out, login page opened 
*Title:* Verify a warning message when email and 
password field are left empty after editing
(Проверьте предупреждающее сообщение, когда электронная почта и
поле пароля остается пустым после редактирования)
*Steps:*
1. left click on email field (щелкните левой кнопкой мыши на поле электронной почты)
2. left click on free space beyond fields (щелкните левой кнопкой мыши по свободному пространству за пределами полей)
3. verify if warning message is displayed (email is required)(проверьте, отображается ли предупреждающее сообщение (требуется электронная почта))
4. left click on password field
5. left click on free space beyond fields
6. verify if warning message is displayed (password is required)
*Expected result:* Warning messages "Email|Password is required." 
are displayed (Предупреждающие сообщения «Требуется электронная почта | пароль».
   отображаются)

*ID*: tc_l3 
*Pre-conditions:* Logged out, login page opened 
*Title:* Check login button is enabled when required fields 
are filled with correct email and password => 8 chars (Кнопка проверки входа включена, когда обязательные поля
заполнены правильным адресом электронной почты и паролем => 8 символов)
*Steps* 
1. enter "test@gmail.com" into email field (введите «test@gmail.com» в поле электронной почты)
2. enter "test@gmail.com" into password field 
3. Check if Login button is active (Проверьте, активна ли кнопка входа) 
*Expected result:* Login button is enabled  (Кнопка входа включена)

*ID:* tc_l4 
*Pre-conditions:* Logged out, login page opened, email field is empty,
password field is empty 
*Title:* Check login button is not enabled when email and password 
fields are empty 
*Steps:* 
1. Click on login button 
*Expected result:* Login button is disabled

More TCs 
Check login button is not enabled when email is filled with qwe@mail.com
and empty password 
Check login button is not enabled when email is empty 
and password is 12345678 
Check login button is not enabled when email 
empty and password is 123456 
Check login button is not enabled when 
is !!!@!!!.!! and password is 12345678 
Verify if the password field is
of the password type 
(Больше ТК
Кнопка проверки входа не включена, когда электронная почта заполнена 
qwe@mail.com
и пустой пароль 
Проверьте, что кнопка входа не активна, когда электронная почта пуста
и пароль 12345678 
Проверьте, что кнопка входа не включена, когда электронная почта
пусто и пароль 123456 
Убедитесь, что кнопка входа в систему не включена, когда
является !!!@!!!.!! и пароль 12345678 
Убедитесь, что поле пароля типа пароля)

**Contacts Page**

*ID:* tc_c1
*Pre-conditions:* Logged in as test@gmail.com, Contacts page is opened 
*Title:* New added contact is in the bottom of the Contacts list 
*Steps:*
1. Click on Add new contact link
2. Enter "Name +" current datetime as a first name, "Second name" + current
datetime as a last name, enter current datetime as About.
3. Press Save button
4. Press on Contacts link
5. Find line with contact data
*Expected results:*
1. Add contact form appeared, Save button is disabled
2. Save button is active
3. New page is opened -- Contact info, First name and last name fields 
contain data from Step 2
4. Contacts page is opened
5. New contact is in the bottom of the list

*ID:* tc_c2 
*Pre-conditions:* Logged in as test@gmail.com, Contacts page is opened,
there are contacts in the list 
*Title:* When contact is clicked in the
Contact list, the Contact info page of this contact is opened 
*Steps:*
1.Choose random contact from Contacts list, remember its name, and click on it
Check that info in the contact list is the same as in the contact info Expected result:
New page is opened -- Contact info, First name and last name fields contain data from the random contact

*ID:* tc_c3 
*Pre-conditions:* Logged in as test@gmail.com, Contacts page is opened 
*Title:* Adding two users with the same Name and Surname is possible, both 
available at Contacts list 
*Steps:*
1. Click on the Add new contact link
2. Generate a random string (e.g. from datetime)
3. Enter "Tim"+random string from s2, "Berton" + random string from s2 as a last name
4. Click Save button, write down url
5. Click on the Add new contact link
6. Repeat step 3 with the same data
7. Click Save button
8. Press on Contacts link
9. Find lines with those contacts 

*Expected results:*
1. Add contact dialog is opened
3. Save button is active
4. Contact info page is opened with name and surname entered in step 3
5. Add contact dialog is opened
6. Save button is active
7. Contact info page is opened with name and surname entered in step 3,
8. url from step 4 > url from the current step
8.  Contacts list is opened
9. Two users with the name, surname from step 3 are in the bottom of the list

*ID:* tc_c4 
*Pre-conditions:* Logged in as test@gmail.com, Contacts page is opened
*Title:* Deleted contact is not visible in the Contacts list 
*Steps:*
1. Click on Add new contact link
2. Enter "Name "+ current datetime as a first name, "Second name" + current datetime as a last name
3. Press Save button
4. Press on Contacts link
5. Find line with contact data
6. Click on 'bin' button to delete our created contact on the line of the contact
7. Confirm the deletion and press Remove contact
8. Find line with contact data 

*Expected results:*
1. Add contact dialog is opened
2. Save button is active
3. Contact info page is opened with data from step 2
4. Contact page is opened
5. New contact is in the list
6. Remove contact dialog is opened
7. Contact list is reloaded, Remove contact message is shown for some seconds
8. Contact is not in the list