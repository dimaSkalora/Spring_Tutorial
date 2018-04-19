package spring_mvc.tutorialspoint_com.spring_mvc_form_tag_library.file_upload;

import org.springframework.web.multipart.MultipartFile;

public class FileModel {
    private MultipartFile file;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
