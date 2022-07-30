# Applying-the-Preceding-axes-method
Assignment 4 W8D5 - SDA - Software QA Bootcamp


## Table of contents
* [Question](#question)
* [Answer](#answer)
* [Output Screenshots](#output-screenshots)


## Question
Create 3 or 4 samples for XPath by applying the preceding method


## Answer
I used itmeo website https://itmeo.com/
Before running the code, there are some steps that need to take considered:


### First:
Setup Latest Web Driver for Chrome  Driver.
Donwload the necessary jar files:
- Selenium (Lastest).
- TestNG (Lastest).
- commander (Lastest).

### Second:
Add them as a library in the classpath of the project
- _click-reight on the file project >Build path > configure Bild path > Java Build Path > Libraries > classpath > add external JARs > Apply and close_.

### Third:
I Opened the website, then write four Xpath using 'preceding' axes method.

- XPath= //a//preceding::a[text()='Landing Pages']

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/182001959-cf86e533-e244-48fd-9c58-2694ef6c98c4.png" width=60% height=60%>
</p>

- XPath= //a//preceding::a[contains(text(),'Templates')]

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/182002025-21e65796-16dd-4ae0-8b61-96842cb2bd17.png" width=60% height=60%>
</p>

- XPath= //input[@class='search-form__input']//preceding::img[@class='logo__img' and @alt='itmeo']

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/182002031-9e54d08e-3f5c-4a95-8149-2796db31a65b.png" width=60% height=60%>
</p>

- XPath= //button//preceding::input[@placeholder='Your email address' or @class='footer-subscribe-form__input']

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/182002055-3940ba6b-d9eb-4fc8-a361-8b85711e943a.png" width=60% height=60%>
</p>


## Output Screenshots:
<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/182002068-6ad84193-15e9-43a1-9af2-5b1a4e7d19cf.png" width=80% height=80%>


https://user-images.githubusercontent.com/48597284/182002099-b652b616-4bd9-468a-b7f9-e4b7766f14ae.mp4
</p>
