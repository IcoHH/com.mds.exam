
This is Java web application which is suppose to be new virtual web web product .
Until now this the only think that this Java application provides is a json 
formatted list of vessels which is accessible through alias 
 “/com.mds.exam/JsonProviderServlet” when the application is deployed. In order to 
 improve the look and feel of the list we need the following:
      1. This list which is provide by this application is hard coded in the java 
         code. In order to make our application more flexible propose a change of 
         JsonProviderServlet to provide dynamic list of vessels. Read the vessel 
         list from a vessels.csv file in which is in the webapp folder.<br>
      2. Create a front page which will display the vessel list provided by the 
         JsonProviderServlet. Make a good looking table with all available vessel data.<br>
      3. Create sort and filtering functionality for the table from the previous point<br>