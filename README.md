# Translator


**Continuous Integration build status** [![Java CI with Gradle](https://github.com/janiceAlvares/verbose/actions/workflows/gradle.yml/badge.svg?branch=master)](https://github.com/janiceAlvares/verbose/actions/workflows/gradle.yml)

**Red Hat Docker Container Status** [![Docker Repository on Quay](https://quay.io/repository/janicealvares/verbose-carnival1/status "Docker Repository on Quay")](https://quay.io/repository/janicealvares/verbose-carnival1)

To run the application you can pull the pubilcy availale image of the application using this command:

>  docker pull quay.io/janicealvares/verbose-carnival1

The program accepts your text message as program arguments and should be prefixed with a mode based on the operation you would like to perform.Acceptable values are  CIPHER or DECIPHER ignoring case.

For example:

  To test cipher run

      docker run docker pull quay.io/janicealvares/verbose-carnival1 cipher he told me i could never teach a llama to drive


  To test deciper 

     docker run docker pull quay.io/janicealvares/verbose-carnival1 decipher kh wrog ph l frxog qhyhu whdfk d oodpd wr gulyh 
