from watchdog.events import PatternMatchingEventHandler


class FileEventHandler(PatternMatchingEventHandler):
    """
    Event handler for file system changes.
    """

    def __init__(self, callback=None, patterns=None, ignore_patterns=None, ignore_directories=True, case_sensitive=False):
        super().__init__(patterns, ignore_patterns, ignore_directories, case_sensitive)
        self.callback = callback

    def on_created(self, event):
        super(FileEventHandler, self).on_created(event)

        # file was updated
        print("Created file: %s", event.src_path)
        if self.callback:
            self.callback(event.src_path)

    def on_modified(self, event):
        super(FileEventHandler, self).on_modified(event)
        # file was updated
        print("Modified file: %s", event.src_path)
        if self.callback:
            self.callback(event.src_path)

    def on_moved(self, event):
        super(FileEventHandler, self).on_modified(event=event)
        print("File moved, operation not supported. ")
        print("vim and gedit use buffers to edit files. Disable behaviour in settings.")
        print("See http://stackoverflow.com/questions/34821933/python-watchdog-event-not-returning-entire-src-path")

