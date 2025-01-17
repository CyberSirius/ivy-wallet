package com.ivy.core.persistence.api.account

import com.ivy.core.data.Account
import com.ivy.core.data.AccountId
import com.ivy.core.persistence.api.Read

interface AccountRead : Read<Account, AccountId, AccountRead.Query> {
    sealed interface Query {
        object All : Query
    }
}