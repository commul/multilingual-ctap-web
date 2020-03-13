# ctap-web

This project is a module of the Common Text Analysis Platform, or CTAP system,
which can be accessed from https://kommul.eurac.edu/ctapWebApp

The CTAP project contains two components: a Web frontend and the feature
extractors backend. The present project is the former component.

The code is written in Java under the Google Web Toolkit framework. GWT dependency has already been added to the project POM, so developers can simply import the project and Maven will handle the rest. If you want to learn more about the GWT framework, please visit http://www.gwtproject.org/.

The purpose of sharing the CTAP web module code is to allow people to extend the functionality of CTAP on the basis of what we've already achieved or run the system on their own server so that they don't need to worry about their data being uploaded to other's servers. But for the users who don't worry about these issues, using the CTAP system from http://ctapweb.com would be the better choice.

The sister project of *ctap-web* is *ctap-feature*, whose git repository is also public under the *ctapweb* Github account. You are highly encourage to check it out and participate in the that project where we focus more on adding analytical features to the CTAP system.

This software is licensed under the BSD License.


```
@ARTICLE{chenmeurersctap,
       author = {{Chen}, X. and {Meurers}, D.},
        title = "{CTAP: A Web-Based Tool Supporting Automatic Complexity Analysis}",
      volume = {Proceedings of the Workshop on Computational Linguistics for Linguistic Complexity (CL4LC)},
     keywords = {linguistic complexity - readability - Italian - text analysis - cross-lingual analysis},
         year = 2016,
        month = December,
       adsurl = {https://www.aclweb.org/anthology/W16-4113}
}
```
