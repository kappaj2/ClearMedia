package za.co.clearline;

import java.io.File;
import java.util.List;

public class TestFileMoves {

	public static void main(String[] args) {

		SourceFileHandler sourceFileHandler = new SourceFileHandler();
		List<File> newFileList = sourceFileHandler.getFilePlayList();

		for (File file : newFileList) {
			System.out.println("Found file entry => " + file.getName());
		}
	}

}
