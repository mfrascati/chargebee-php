module ChargeBee
  class Coupon < Model

  attr_accessor :id, :name, :invoice_name, :discount_type, :discount_percentage, :discount_amount,
  :discount_quantity, :duration_type, :duration_month, :valid_till, :max_redemptions, :status,
  :redemptions, :apply_discount_on, :apply_on, :applicable_plans, :applicable_addons, :created_at,
  :archived_at, :plan_ids, :addon_ids

  # OPERATIONS
  #-----------
    
  def self.create(params, env=nil)
    Request.send('post', "/coupons", params, env)
  end    

  def self.list(params={}, env=nil)
    Request.send('get', "/coupons", params, env)
  end    

  def self.retrieve(id, env=nil)
    Request.send('get', "/coupons/#{id.to_s}", {}, env)
  end    

  end # ~Coupon
end # ~ChargeBee    