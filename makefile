jar:compile
	jar cvfm catalogo.jar Manifest.txt -C bin .

compile:clean
	find src -name "*.java" | xargs javac -cp bin -d bin

javadoc:
	rm -rf html
	mkdir html
	find src -name "*.java" | xargs javadoc -d html -encoding utf-8 -docencoding utf-8 -charset utf-8

clean:
	rm -rf bin
	mkdir bin


