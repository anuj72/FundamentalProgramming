package RxKotlin

fun main(){
  /*  return textChangeObservable
        .filter { it.length >= 2 }
        .debounce(1000, TimeUnit.MILLISECONDS)
    */



    //observable
    /*disposable = searchTextObservable // change this line
        .observeOn(AndroidSchedulers.mainThread())
        .doOnNext { showProgress() }
        .observeOn(Schedulers.io())
        .map { cheeseSearchEngine.search(it) }
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe {
            hideProgress()
            showResult(it)
        }*/

   /* observable.suscribe{
        override onsuscribe(){}
        override onNext(){}
         override onError(){}
         override onComplete(){}
    }*/
}