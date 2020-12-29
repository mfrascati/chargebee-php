<?php

namespace ChargeBee\ChargeBee\Models;

use ChargeBee\ChargeBee\Model;

class SubscriptionEstimateContractTerm extends Model
{
  protected $allowed = array(
      'id',
      'status',
      'contract_start',
      'contract_end',
      'billing_cycle',
      'action_at_term_end',
      'total_contract_value',
      'cancellation_cutoff_period',
      'created_at',
      'subscription_id',
      'remaining_billing_cycles'
  );

}