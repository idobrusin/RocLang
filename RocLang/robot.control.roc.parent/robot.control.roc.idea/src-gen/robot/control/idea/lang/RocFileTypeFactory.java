/*
 * generated by Xtext 2.10.0
 */
package robot.control.idea.lang;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

public class RocFileTypeFactory extends FileTypeFactory {

	@Override
	public void createFileTypes(@NotNull FileTypeConsumer consumer) {
		consumer.consume(RocFileType.INSTANCE, AbstractRocFileType.DEFAULT_EXTENSION);
	}

}
