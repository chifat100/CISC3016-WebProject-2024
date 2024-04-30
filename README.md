## Introduction

(https://github.com/chifat100/CISC3016-WebProject-2024/): github link

This is a homework for a university multimedia course.

We wrote a html builder, a css builder, and a http server in java
to generate and host our web content.
However, we do not have enough time to finish the HTML parser, so we opted to use
the Jsoup library instead.

Our website will scrap the information from these four sites,
if our site seems to be broken, these sites could be updated or became unavailable.
- (https://www.gov.mo/zh-hant/news/?display_mode=grid): for govornment news.
- (https://www.um.edu.mo/category/news-and-press-releases/): for um news.
- (https://www.modaily.cn/amucsite/web/index.html#/home): for mo daily news.
- (https://dictionary.cambridge.org/us/dictionary/english/): for the dictionary look up function.

The website loading time is slow due to we fetch the contents of the above sites synchronously.
When you have entered a word in the dictionary look up input field, our site will not fetch the
news. This is for better performance. You need to empty the field to see the news again.

## Installation

We use java 22 for this project, but it may be possible to build with lower version of java

We have included the .class files in the project,
to run the our project, ensure java is installed, than run

```sh
cd "/root/path/of/the/project"
java --class-path bin:lib/jsoup-1.17.2.jar Web
```

in the terminal.

Alternatively, you can built our project by

```sh
cd "/root/path/of/the/project"
javac --class-path src/:lib/jsoup-1.17.2.jar -d bin @sources.txt
```

this will generate the .class files of our project
then it can be run using the previous commands.

We also included the configuration files for both intellij IDEA and vscode,
if you have any of the above 2 editor installed, you can also open our project
with them, then clicking the run button should be able to run the project.

> You must keep the current directory as the root directory of the project,
or else static contents might not be displayed.

> Our server runs on 5100 port, please ensure that port is free, or you can
change the port in Web.java file

