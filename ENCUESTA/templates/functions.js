this.upload = function() {
    var fileInput = document.getElementById('fileinput');
    for (var i = 0; i < fileInput.files.length; i++) {

      var file = fileInput.files[i];
      var xhr = new XMLHttpRequest();
      var fd = new FormData();

     xhr.open("POST", "http://somehost.com/upload", true);    

      fd.append("upload_file", file, 'YOUR_FILENAME_' + file.name);

      xhr.send(fd);

    }
  }