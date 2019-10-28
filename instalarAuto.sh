#Copio el .vimrc en el HOME.
cp .vimrc ~

#Me bajo el Pathogen
mkdir -p ~/.vim/autoload ~/.vim/bundle && \
curl -LSso ~/.vim/autoload/pathogen.vim https://tpo.pe/pathogen.vim

#Me bajo el autocompletar de Java
cd ~/.vim/bundle
git clone https://github.com/artur-shaik/vim-javacomplete2.git
