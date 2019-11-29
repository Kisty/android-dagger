package com.example.android.dagger.registration

import com.example.android.dagger.di.ActivityScope
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Subcomponent


@ActivityScope
@Subcomponent
interface RegistrationComponent {
    fun inject(actvity: RegistrationActivity)
    fun inject(f: EnterDetailsFragment)
    fun inject(f: TermsAndConditionsFragment)

    @Subcomponent.Factory
    interface Factory {
        fun create(): RegistrationComponent
    }
}