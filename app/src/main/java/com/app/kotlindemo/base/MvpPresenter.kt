package com.app.kotlindemo.base

interface MvpPresenter<V : MvpView> {

    fun onAttach(mvpView: V)

    fun onDetach()
}