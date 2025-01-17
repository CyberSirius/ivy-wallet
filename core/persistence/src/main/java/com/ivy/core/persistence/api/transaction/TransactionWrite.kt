package com.ivy.core.persistence.api.transaction

import com.ivy.core.data.TransactionId
import com.ivy.core.persistence.api.Write
import com.ivy.data.transaction.Transaction

interface TransactionWrite : Write<Transaction, TransactionId>