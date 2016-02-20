<%@ page import="com.google.appengine.api.blobstore.BlobstoreServiceFactory" %>
<%@ page import="com.google.appengine.api.blobstore.BlobstoreService" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
    BlobstoreService blobstoreService = BlobstoreServiceFactory.getBlobstoreService();
%>

<html>
  <body>
    <p>Upload an audio</p>
    <form action="<%= blobstoreService.createUploadUrl("/rest/audio") %>" method="POST" enctype="multipart/form-data">
      <label> Audio:</label><input type="file" name="myAudio">
      <input type="submit">
    </form>
  </body>
</html>